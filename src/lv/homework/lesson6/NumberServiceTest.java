package lv.homework.lesson6;

public class NumberServiceTest {

    public static void main(String[] args) {

        NumberService serviceSumInRange = new NumberService(-6, 6);
        NumberService serviceEvenNumberCount = new NumberService(4, -2);

        System.out.println("Sum in range:" + serviceSumInRange.getFirstNumber()
                + " to " + serviceSumInRange.getSecondNumber()
                + " is: " + serviceSumInRange.sumInRange());

        System.out.println("Even number count in range: " + serviceEvenNumberCount.getFirstNumber()
                + " to " + serviceEvenNumberCount.getSecondNumber()
                + " is: " + serviceEvenNumberCount.getEvenNumberCount());
    }
}
