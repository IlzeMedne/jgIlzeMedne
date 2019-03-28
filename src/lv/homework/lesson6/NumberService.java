package lv.homework.lesson6;

public class NumberService {

    //Metode nedrīkst būt statiska un tai ir jāveic aprēķins un jāatgriež rezultāts
    public static void sumInRange(int firstNumber, int secondNumber) {
        int sum = 0;
        for (int i = startNumber(firstNumber, secondNumber);
             i <= endNumber(firstNumber, secondNumber); i++) {
            sum = sum + i;  //sum += i;
        }
        //Datu izvadi veicam test klasē
        System.out.println("Sum in range: " + firstNumber + " to "
                + secondNumber + " is: " + sum);
        System.out.println();
    }

    //Metode nedrīkst būt statiska un tai ir jāveic aprēķins un jāatgriež rezultāts
    public static void getEvenNumberCount(int a, int b) {
        int count = 0;
        for (int i = startNumber(a, b); i <= endNumber(a, b); i++) {
            if (isEvenNumber(i)) {
                count += 1;
            }
        }
        //Datu izvadi veicam test klasē
        System.out.println("Even number count in range: " + a + " to " + b + " is: " + count);
    }

    //Metode nedrīkst būt statiska
    private static boolean isEvenNumber(int i) {
        //inline if lietojam
        if (i % 2 == 0 && i != 0) {
            return true;
        } else {
            return false;
        }
    }

    //Metode nedrīkst būt statiska
    private static int endNumber(int firstNumber, int secondNumber) {
        //šeit labak rakstīt inline if
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    //Metode nedrīkst būt statiska
    private static int startNumber(int firstNumber, int secondNumber) {
        //šeit labak rakstīt inline if
//        return firstNumber < secondNumber ? firstNumber : secondNumber;
        if (firstNumber < secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
