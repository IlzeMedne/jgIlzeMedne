package lv.homework.lesson6;

public class NumberService {

    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public NumberService(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sumInRange() {
        int sum = 0;
        for (int i = startNumber(firstNumber, secondNumber);
             i <= endNumber(firstNumber, secondNumber); i++) {
            sum += i;
        }
        return sum;
    }

    public int getEvenNumberCount() {
        int count = 0;
        for (int i = startNumber(firstNumber, secondNumber); i <= endNumber(firstNumber, secondNumber); i++) {
            if (isEvenNumber(i)) {
                count += 1;
            }
        }
        return count;
    }

    private boolean isEvenNumber(int i) {
        return i % 2 == 0 && i != 0 ? true : false;
    }

    private int endNumber(int firstNumber, int secondNumber) {
        return firstNumber < secondNumber ? secondNumber : firstNumber;
    }

    private int startNumber(int firstNumber, int secondNumber) {
        return firstNumber < secondNumber ? firstNumber : secondNumber;
    }
}
