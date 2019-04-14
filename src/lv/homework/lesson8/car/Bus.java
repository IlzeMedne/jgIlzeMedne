package lv.homework.lesson8.car;

public class Bus extends Car {

    @Override
    String color() {
        return "red";
    }

    @Override
    String manufacturer() {
        return "Toyota";
    }

    @Override
    int year() {
        return 2010;
    }

    public int passengersSeats() {
        return 25;
    }
}
