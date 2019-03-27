package lv.homework.lesson6;


import java.util.Scanner;

public class ExampleFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you want input for average calculating: ");
        int numbersCount = scanner.nextInt();
        double number = 0;

        for (int i = 1; i <= numbersCount; i++) {
            System.out.println("Input number" + i + ": ");
            number = number + scanner.nextDouble();
        }
        double average = number / numbersCount;
        System.out.println("Average = " + average);

        System.out.println();
        System.out.println("2.uzdevums: ja skaitilis N ir pozitīvs," +
                " tad izvadīt konsolē visus skaitļus no 0 līdz N");

        System.out.println("Ievadiet skaitli N:");
        int valueN;
        do {
            System.out.println("Lūdzu ievadiet pozitīvu skaitli:");
            valueN = scanner.nextInt();
        } while (valueN <= 0);

        for (int i = 0; i <= valueN; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("3.uzdevums: izvadīt konsolē visus pāra skaitļus: ");

        for (int i = 0; i <= valueN; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("4.uzdevums: izvade pretējā secībā:");

        for (int i = valueN; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
