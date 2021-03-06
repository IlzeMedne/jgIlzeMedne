package lv.homework.lesson8.car2;

import java.util.Objects;

public class Car {

    private String color;
    private String manufacturer;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String color, String manufacturer, int year) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    @Override
    public String toString() {
        return ", color: " + color +
                ", manufacturer: " + manufacturer +
                ", year: " + year;
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
