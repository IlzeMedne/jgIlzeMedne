package lv.homework.lesson3;

public class SquareCalculatorTest {
    public static void main(String[] args) {

        SquareCalculator squareCalculator = new SquareCalculator();

        int expectedResult = 225;

        int actualResult = squareCalculator.calculateSquare(15);

        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + expectedResult);

        boolean isResultsEqual = expectedResult == actualResult;

        System.out.println("Is result equal: " + isResultsEqual);
    }
}
