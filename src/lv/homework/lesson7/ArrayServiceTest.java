package lv.homework.lesson7;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.create(6);

        arrayService.fillArrayWithRandomNumbers(array);
        System.out.println("Array filled with random numbers:");
        arrayService.printArrayToConsole(array);

        System.out.println();
        System.out.println("\nSum in array is: " + arrayService.sumInArray(array));

        arrayService.swapReverse(array);
        System.out.println("\nArray swapped reverse is: ");
        arrayService.printArrayToConsole(array);

        System.out.println();
        arrayService.swap(array,0,1);
        System.out.println("\nSwapped first and second element in array: ");
        arrayService.printArrayToConsole(array);

        System.out.println();
        arrayService.sortArrayInAscendingOrder(array);
        System.out.println("\nSorted array with created method: ");
        arrayService.printArrayToConsole(array);

        System.out.println();
        Arrays.sort(array);
        System.out.println("\nSorted array with java.util.Arrays: ");
        arrayService.printArrayToConsole(array);

        System.out.println();
        arrayService.swapReverse(array);
        System.out.println("\nReverse swapped array is: ");
        arrayService.printArrayToConsole(array);
    }
}
