package lv.homework.lesson2;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt(101);
        int secondRandomNumber = randomGenerator.nextInt(101);
        int thirdRandomNumber = randomGenerator.nextInt(101);

        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(thirdRandomNumber);

        System.out.println("Another option for random");
        System.out.println("0. For [0;1)");

        double forZeroToOne = Math.random();
        System.out.println(forZeroToOne);

        System.out.println("1. For [0;3)");

        double forZeroToThree = Math.random() * 3; //(Math.random()*(b-a))+a
        System.out.println(forZeroToThree);

        System.out.println("2. For [2;3)");
        double forTwoToThree = Math.random() + 2; // (Math.random()*(3-2))+2
        System.out.println(forTwoToThree);

        System.out.println("3. For [20;60)");
        double forTwentyToSixty = 20 + Math.random() * 40; //*(60-20)+20
        System.out.println(forTwentyToSixty);

        System.out.println("4. For [-100;+100)");
        double fourthExample = Math.random() * 200 - 100; //*(100+100)-100
        System.out.println(fourthExample);

        System.out.println(" Generation of integers:");
        System.out.println("5. For [0;2] integers, including 2");
        int fifthExample = (int) (Math.random() * 3); // (Math.random()*(3-1+1))+1 or (b-a+1)+a
        System.out.println(fifthExample);

        System.out.println("6. For [3;4] integers, including 4");
        int sixthExample = 3 + (int) (Math.random() * 2); // *(4-3+1)+3 or (b-a+1)+a
        System.out.println(sixthExample);

        System.out.println("7. For [-100;100] integers, including 100");
        int seventhExample = (int) (Math.random() * 201) - 100; // *(100+100+1)-100 or (b-a+1)+a
        System.out.println(seventhExample);

        System.out.println("8. For [-200;400] integers, including 400");
        int eighthExample = (int) (Math.random() * 601) - 200; // *(400+200+1)-200 or (b-a+1)+a
        System.out.println(eighthExample);

        System.out.println("9. For [1;2] integers, including 2");
        int ninthExample = (int) (Math.random() * 2) + 1; // *(2-1+1)+1 or (b-a+1)+a
        System.out.println(ninthExample);

    }

}
