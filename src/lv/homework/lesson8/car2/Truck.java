package lv.homework.lesson8.car2;

import java.util.Objects;

public class Truck extends Car {

    private int capacityTons;

    public Truck(String color, String manufacturer, int year, int capacityTons) {
        super(color, manufacturer, year);
        this.capacityTons = capacityTons;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacityTons=" + capacityTons +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return capacityTons == truck.capacityTons;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacityTons);
    }
}