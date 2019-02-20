package lv.homework.lesson3;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sumResult = calculator.sum(10,15);
        int subtractResult = calculator.subtract(3,10);
        int multiplyResult = calculator.multiply(20,20);
        double divideResult = calculator.divide(5,2);

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Multiplication result: " + multiplyResult);
        System.out.println("Division result: " + divideResult);



    }
}
