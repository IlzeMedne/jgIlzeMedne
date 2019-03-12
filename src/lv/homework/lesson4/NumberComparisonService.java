package lv.homework.lesson4;

public class NumberComparisonService {

    public boolean isEqual(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber;
    }

    public boolean isGrater(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }

    public boolean isLess(int firstNumber, int secondNumber) {
        return firstNumber < secondNumber;
    }

    public boolean isGraterOrEquals(int firstNumber, int secondNumber) {
        return firstNumber >= secondNumber;
    }

    public boolean isLessOrEquals(int firstNumber, int secondNumber) {
        return firstNumber <= secondNumber;
    }

    public boolean isNotEqual(int firstNumber, int secondNumber) {
        return firstNumber != secondNumber;
    }
}
