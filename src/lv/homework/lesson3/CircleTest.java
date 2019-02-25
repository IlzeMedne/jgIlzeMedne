package lv.homework.lesson3;

public class CircleTest {
    public static void main(String[] args) {

        Circle myCircle = new Circle();

        myCircle.setRadius(20);
        myCircle.calculateArea();  //lieka rinda, jo rezultāts tiek aprēķināts, bet netiek saglabāts

        System.out.println("Circle area is: " + myCircle.calculateArea());













    }

}
