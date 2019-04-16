package lv.homework.lesson8.car2;

import java.util.Objects;

public class PassengerCar extends Car {

    private String carType;

    public PassengerCar(String color, String manufacturer, int year, String carType) {
        super(color, manufacturer, year);
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Passenger Car:" +
                "\ncar type: " + carType
                + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return Objects.equals(carType, that.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carType);
    }
}
