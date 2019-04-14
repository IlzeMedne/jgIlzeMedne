package lv.homework.lesson8.car;

public class Truck extends Car {

    @Override
    String color() {
        return "grey";
    }

    @Override
    String manufacturer() {
        return "Scania";
    }

    @Override
    int year() {
        return 2008;
    }

    public double capacityTons() {
        return 24;
    }
}