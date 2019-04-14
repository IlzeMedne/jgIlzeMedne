package lv.homework.lesson8.car2;

import java.util.Objects;

public class Car {

    private String color;
    private String manufacturer;
    private int year;

    public Car(String color, String manufacturer, int year) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year='" + year + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, manufacturer, year);
    }
}
