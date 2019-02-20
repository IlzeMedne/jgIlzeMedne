package lv.homework.lesson3;

public class SquareCalculatorTest {
    public static void main(String[] args) {

        SquareCaltulator squareCaltulator = new SquareCaltulator();

        int expectedResult = 225;

        int actualResult = squareCaltulator.calculateSquare(15);

        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + expectedResult);

        boolean isResultsEqual = expectedResult == actualResult;

        System.out.println("Is result equal: " + isResultsEqual);

    }
}
