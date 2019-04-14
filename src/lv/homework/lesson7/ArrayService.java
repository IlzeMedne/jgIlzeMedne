package lv.homework.lesson7;

import java.util.Random;

public class ArrayService {

    private int n;

    public int[] create(int n) {
        this.n = n;
        return new int[n];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = newRandomNumber();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public int sumInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public void sortArrayInAscendingOrder(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void swapReverse(int[] array) {
        for (int first = 0, last = array.length - 1; first < last; first++, last--) {
            swap(array, first, last);
        }
    }

    public void swap(int[] array, int element, int toElement) {
        int temp = array[element];
        array[element] = array[toElement];
        array[toElement] = temp;
    }

    private int newRandomNumber() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);
        return randomNumber;
    }
}
