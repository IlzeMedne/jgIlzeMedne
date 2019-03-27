package lv.homework.lesson6;

public class NumberService {

    public static void sumInRange(int firstNumber, int secondNumber) {
        int sum = 0;
        for (int i = startNumber(firstNumber, secondNumber);
             i <= endNumber(firstNumber, secondNumber); i++) {
            sum = sum + i;
        }
        System.out.println("Sum in range: " + firstNumber + " to "
                + secondNumber + " is: " + sum);
        System.out.println();
    }

    public static void getEvenNumberCount(int a, int b) {
        int count = 0;
        for (int i = startNumber(a, b); i <= endNumber(a, b); i++) {
            if (isEvenNumber(i)) {
                count += 1;
            }
        }
        System.out.println("Even number count in range: " + a + " to " + b + " is: " + count);
    }

    private static boolean isEvenNumber(int i) {
        if (i % 2 == 0 && i != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int endNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    private static int startNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
