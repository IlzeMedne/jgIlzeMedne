package lv.homework.lesson4;

public class NumberComparisionServiceTest {

    public void testIsEqual() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isEqual(10, 10);

        if (expectedResult == actualResult) {
            System.out.println("Test 'Is Equal' has passed");
        } else {
            System.out.println("Test 'Is Equal' has failed");
            System.out.println("Expected result: " + expectedResult
                    + ", but was: " + actualResult);
        }
    }

    public void testIsGrater() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isGrater(8, 6);

        if (expectedResult == actualResult) {
            System.out.println("Test 'Is Grater' has passed");

        } else {
            System.out.println("Test 'Is Grater' has failed");
            System.out.println("Expected result: " + expectedResult
                    + ", but was: " + actualResult);
        }
    }

    public void testIsLess() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isLess(1, 6);

        if (expectedResult == actualResult) {
            System.out.println("Test 'Is Less' has passed");

        } else {
            System.out.println("Test 'Is Less' has failed");
            System.out.println("Expected result: " + expectedResult
                    + ", but was: " + actualResult);
        }
    }

    public void testIsGraterOrEqual() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isGraterOrEquals(6, 6);

        if (expectedResult == actualResult) {
            System.out.println("Test 'Is Grater or Equal' has passed");

        } else {
            System.out.println("Test 'Is Grater or Equal' has failed");
            System.out.println("Expected result: " + expectedResult
                    + ", but was: " + actualResult);
        }
    }

    public void testIsLesOrEqual() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isLessOrEquals(4, 6);

        if (expectedResult == actualResult) {
            System.out.println("Test 'Is Less or Equal' has passed");

        } else {
            System.out.println("Test 'Is Less or Equal' has failed");
            System.out.println("Expected result: " + expectedResult
                    + ", but was: " + actualResult);
        }
    }

    public void testIsNotEqual() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isNotEqual(3, 6);

        if (expectedResult == actualResult) {
            System.out.println("Test 'Is not Equal' has passed");

        } else {
            System.out.println("Test 'Is not Equal' has failed");
            System.out.println("Expected result: " + expectedResult
                    + ", but was: " + actualResult);
        }
    }

    public static void main(String[] args) {
        NumberComparisionServiceTest testRunner = new NumberComparisionServiceTest();
        testRunner.testIsEqual();
        testRunner.testIsGrater();
        testRunner.testIsLess();
        testRunner.testIsGraterOrEqual();
        testRunner.testIsLesOrEqual();
        testRunner.testIsNotEqual();
    }
}
