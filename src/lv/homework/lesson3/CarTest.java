package lv.homework.lesson3;

public class CarTest {
    public static void main(String[] args) {

        Car firstCar = new Car();

        firstCar.setColor("black");
        firstCar.setManufacturer("Mercedes");
        firstCar.setYear(2018);

        //garās rindas ajag sadalīt īsākās
        System.out.println("I want " + firstCar.getColor()
                + " " + firstCar.getManufacturer()
                + " of " + firstCar.getYear() + " year.");




    }

}
