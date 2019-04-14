package lv.homework.lesson8.car2;

public class PlayWithCars {
    public static void main(String[] args) {

        PassengerCar passengerCar1 = new PassengerCar("black", "Mercedes", 2012, "Sedan");
        PassengerCar passengerCar2 = new PassengerCar("red", "Toyota", 2016, "Cabriolet");
        PassengerCar passengerCar3 = new PassengerCar("red", "Toyota", 2016, "Hatchback");
        PassengerCar passengerCar4 = new PassengerCar("red", "Toyota", 2016, "Hatchback");
        Bus bus1 = new Bus("yellow", "Neoplan", 2004, 50);
        Bus bus2 = new Bus("grey", "Volkswagen", 2012, 8);
        Truck truck1 = new Truck("grey", "Scania", 1998, 24);

        Car[] myCars = {passengerCar1, passengerCar2, passengerCar3, passengerCar4, bus1, bus2, truck1};

        System.out.println("MY CARS: ");
        for (Car cars : myCars) {
            print(cars);
        }

        System.out.println("\nCOMPARE TEST: Passenger car 2 and Passenger car 3:");
        boolean isPassengerCar2EqualTo3 = passengerCar2.equals(passengerCar3);
        if (isPassengerCar2EqualTo3) {
            System.out.println("Test PASS. Passenger car 2 is equal to passenger car 3");
        } else {
            System.out.println("Test FAIL. Cars are not equal, because passenger car 2 is: \n"
                    + passengerCar2 + ",\nbut passenger car 3 is: \n" + passengerCar3);
        }

        System.out.println("\nCOMPARE TEST: Passenger car 3 and Passenger car 4:");
        boolean isPassengerCar3EqualTo4 = passengerCar3.equals(passengerCar4);
        if (isPassengerCar3EqualTo4) {
            System.out.println("Test PASS. Passenger car 3 is equal to passenger car 4");
        } else {
            System.out.println("Test FAIL. Cars are not equal, because passenger car 3 is: \n"
                    + passengerCar3 + ",\nbut passenger car 4 is: \n" + passengerCar4);
        }
    }

    private static void print(Car cars) {
        System.out.println(cars);
    }
}