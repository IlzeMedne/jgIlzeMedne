package lv.homework.lesson5;

public class SmartPhoneTest {

    public static void main(String[] args) {

        SmartPhone iPhoneXs = new SmartPhone();

        iPhoneXs.setColor("Space grey");
        iPhoneXs.setManufacturer("Apple");
        iPhoneXs.setProcessorType("Hexa-Core");
        iPhoneXs.setScreenSize(6.5);

        SmartPhone iPhoneX = new SmartPhone();

        iPhoneX.setColor("Space grey");
        iPhoneX.setManufacturer("Apple");
        iPhoneX.setProcessorType("Hexa-Core");
        iPhoneX.setScreenSize(6.5);

        System.out.println(iPhoneXs);

        System.out.println("VS");

        System.out.println(iPhoneX);

        System.out.println("Equals result: " + iPhoneXs.equals(iPhoneX));
    }
}
