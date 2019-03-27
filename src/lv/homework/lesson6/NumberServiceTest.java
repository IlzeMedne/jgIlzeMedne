package lv.homework.lesson6;

public class NumberServiceTest {

    public static void main(String[] args) {
        NumberService service = new NumberService();

        service.sumInRange(-6, 6);
        service.getEvenNumberCount(-2, 4);
    }
}
