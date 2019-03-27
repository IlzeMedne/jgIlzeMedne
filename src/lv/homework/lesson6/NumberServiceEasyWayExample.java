package lv.homework.lesson6;

public class NumberServiceEasyWayExample {

    public static void main(String[] args) {

        int a = 0;
        int b = 5;

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (IsEvenNumber(i)) {
                count += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }

    private static boolean IsEvenNumber(int i) {
        if (i % 2 == 0 && i != 0) {
            return true;
        }
        return false;
    }
}

