package lv.homework.lesson8.car2;

import java.util.Objects;

public class Bus extends Car {

    private int passengersSeats;

    public Bus(String color, String manufacturer, int year, int passengersSeats) {
        super(color, manufacturer, year);
        this.passengersSeats = passengersSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengersSeats=" + passengersSeats +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengersSeats == bus.passengersSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersSeats);
    }
}