package lv.homework.lesson6;

import java.sql.SQLOutput;

public class PrimeNumbersSum {

    public static void main(String[] args) {
        printPrimeNumbers(0, 500);
        sumPrimeNumbers(0, 500);
        countPrimeNumbers(0, 500);
        sumPrimeNumbersExcept17and71(0, 500);
        countPrimeNumbersExcept17and71(0, 500);
        countPrimeNumbersExcept17and71TillCountIs50(0, 500);
        sumPrimeNumbersExcept17and71TillCountIs50(0, 500);
    }

    private static void sumPrimeNumbersExcept17and71TillCountIs50(int from, int to) {
        int sum = 0;
        int count = 0;
        for (int i = from; i < to; i++) {
            if (isPrimeNumber(i)) {
                if (exception(i)) {
                    continue;
                }
                if (count == 50) {
                    break;
                }
                sum = sum + i;
                count += 1;
            }
        }
        System.out.println("Sum of Prime Numbers, except 17 and 71," +
                " till count is 50, is: " + sum);
    }

    private static void countPrimeNumbersExcept17and71TillCountIs50(int from, int to) {
        int count = 0;
        for (int i = from; i < to; i++) {
            if (isPrimeNumber(i)) {
                if (exception(i)) {
                    continue;
                }
                if (count == 50) {
                    break;
                }
                count += 1;
            }
        }
        System.out.println("Count of Prime Numbers, except 17 and 71," +
                " till count is 50, is: " + count);
    }

    private static void countPrimeNumbersExcept17and71(int from, int to) {
        int count = 0;
        for (int i = from; i < to; i++) {
            if (isPrimeNumber(i)) {
                if (exception(i)) {
                    continue;
                }
                count += 1;
            }
        }
        System.out.println("Count of Prime Numbers, except 17 and 71, is: " + count);
    }

    private static void sumPrimeNumbersExcept17and71(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            if (isPrimeNumber(i)) {
                if (exception(i)) {
                    continue;
                }
                sum = sum + i;
            }
        }
        System.out.println("Sum of Prime Numbers, except 17 and 71, is: " + sum);
    }

    private static boolean exception(int number) {
        if (number == 17 || number == 71) {
            return true;
        } else {
            return false;
        }
    }

    private static void countPrimeNumbers(int from, int to) {
        int count = 0;
        for (int i = from; i < to; i++) {
            if (isPrimeNumber(i)) {
                count += 1;
            }
        }
        System.out.println("Count of Prime Numbers is: " + count);
    }

    private static void sumPrimeNumbers(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            if (isPrimeNumber(i)) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of Prime Numbers is: " + sum);
    }

    private static void printPrimeNumbers(int from, int to) {
        System.out.println("Prime Numbers are: ");
        for (int i = from; i < to; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
