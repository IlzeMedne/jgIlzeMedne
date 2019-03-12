package lv.homework.lesson3;

public class HumanTest {

    public static void main(String[] args) {

        Human myHuman = new Human();
        myHuman.setName("John");
        myHuman.setAge(20);

        myHuman.sayHi();
        System.out.println("My name is " + myHuman.getName()
                + ", I'm " + myHuman.getAge() + " years old");
    }
}
