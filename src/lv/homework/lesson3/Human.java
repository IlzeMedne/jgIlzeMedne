package lv.homework.lesson3;

public class Human {

    private String name;

    private int age;

    public void sayHi() {
        System.out.println("Hi!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
