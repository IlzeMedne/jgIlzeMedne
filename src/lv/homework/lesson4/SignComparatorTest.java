package lv.homework.lesson4;

public class SignComparatorTest {

    public static void main(String[] args) {
        SignComparator comparator = new SignComparator();

        int number = 123;
        String result = comparator.compare(number);
        System.out.println(number + ": " + result);

        SignComparatorTest test = new SignComparatorTest();
        test.shouldNumberIsPositive();
        test.shouldNumberIsNegative();
        test.shouldNumberIsEqualToZero();
    }

    public void shouldNumberIsPositive(){
        SignComparator comparator = new SignComparator();
        String result = comparator.compare(145);
        compareResult(result.equals("Number ir positive") , "shouldNumberIsPositive");
    }

    public void shouldNumberIsNegative(){
        SignComparator comparator = new SignComparator();
        String result = comparator.compare(-5);
        compareResult(result.equals("Number is negative"),"shouldNumberIsNegative");
    }
    public void shouldNumberIsEqualToZero(){
        SignComparator comparator = new SignComparator();
        String result = comparator.compare(0);
        compareResult(result.equals("Number is equal to zero"),"shouldNumberIsEqualToZero");
    }

    void compareResult (boolean result,String testName){
        if (result){
            System.out.println(testName + " OK");
        } else{
            System.out.println(testName + " FAIL");
        }
    }
}
