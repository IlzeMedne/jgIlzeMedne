package lv.homework.lesson6;


public class OddNumbers {

    public static void main(String[] args) {

        printOddNumbersWithWhile();
        printOddNumbersWithFor();
        printOddNumbersWithDoWhile();
    }

    private static void printOddNumbersWithDoWhile() {

        System.out.println("Odd numbers with DO WHILE: ");
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 50);

        System.out.println();


    }

    private static void printOddNumbersWithFor() {

        System.out.println("Odd numbers with ExampleFor:");

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    private static void printOddNumbersWithWhile() {

        System.out.println("Odd numbers with WHILE: ");

        int i = 0;

        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println();

    }
}
