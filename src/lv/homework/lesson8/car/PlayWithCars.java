package lv.homework.lesson8.car;

public class PlayWithCars {

    public static void main(String[] args) {

        PassengerCar myPassengerCar = new PassengerCar();
        Truck myTruck = new Truck();
        Bus myBus = new Bus();

        System.out.println("Equal or not test (TEST DOES NOT WORKS HERE LIKE I NEED): ");
        boolean carComparison = myPassengerCar.equals(myBus);

        System.out.println((myBus).equals(myPassengerCar));

        if (carComparison) {
            System.out.println("My passenger car is equal to my bus");
        } else {
            System.out.println("My passenger car is NOT equal to my bus, because:" +
                    "\nMy passenger car is: " + myPassengerCar +
                    "\nMy bus is: " + myBus);
        }

        Car[] myCars = {myPassengerCar, myTruck, myBus};

        for (Car cars : myCars) {
            print(cars);
            if (cars == myPassengerCar) {
                printMyPassengerCar(myPassengerCar);
            }
            if (cars == myTruck) {
                printMyTruck(myTruck);
            }
            if (cars == myBus) {
                printMyBus(myBus);
            }
        }
    }

    private static void printMyPassengerCar(PassengerCar myPassengerCar) {
        System.out.println("Car type: " + myPassengerCar.carType());
    }

    private static void printMyBus(Bus myBus) {
        System.out.println("Passenger seats: " + myBus.passengersSeats());
    }

    private static void printMyTruck(Truck myTruck) {
        System.out.println("Capacity tons: " + myTruck.capacityTons());
    }

    private static void print(Car cars) {
        System.out.println("========" + cars);
    }
}