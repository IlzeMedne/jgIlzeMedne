package lv.homework.lesson2;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 5;

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int devideResult = firstNumber / secondNumber; // "devide" - pareizrakstība
        int multiplyResult = firstNumber * secondNumber;

        System.out.println("Sum Result: "+ sumResult); //"ctrl + alt + l" koda formatēšāna - pirms un pēc "+" atsrapei jābūt
        System.out.println("Subtract Result: " + subtractResult);
        System.out.println("Devide Result: " + devideResult);    //pareizrakstība
        System.out.println("Multily Result: " + multiplyResult); //pareizrakstība

        //Shis nebija uzdevumā prasīts
        System.out.println("WATERHOUSE INVENTORY");

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER Opening balance, kg (two decimal places):");
        double openingBalace = scanner.nextDouble(); //misspelling
        System.out.println("ENTER Incoming, kg (two decimal places):");
        double incoming = scanner.nextDouble();
        System.out.println("ENTER Outgoing, kg (two decimal places):");
        double outgoing = scanner.nextDouble();

        double closingBalance = getClosingBalance(openingBalace, incoming, outgoing); //better "calculateClosingBalance"

        System.out.println("Closing Balance, kg is: " + closingBalance);

        System.out.println("ENTER INVENTORY PERIOD IN DAYS:");
        int inventoryPeriodInDays = scanner.nextInt();

        double averageIncomingPerDay = getAverageIncomingPerDay(incoming, inventoryPeriodInDays);

        System.out.println("averageIncomingPerDay, kg is " + averageIncomingPerDay);


    }

    private static double getAverageIncomingPerDay(double incoming, int inventoryPeriodInDays) {
        return incoming / inventoryPeriodInDays;
    }

    private static double getClosingBalance(double openingBalace, double incoming, double outgoing) { //misspelling
        return openingBalace + incoming - outgoing;
    }
}
