package lv.homework.lesson3;

public class BookTest {

    public static void main(String[] args) {

        Book firstBook = new Book();

        firstBook.setAuthor("Ruslan");
        firstBook.setTitle("JavaGuru");
        firstBook.setPageCount(1001);
        firstBook.setYear(2018);

        System.out.println("Author: " + firstBook.getAuthor());
        System.out.println("Title: " + firstBook.getTitle());
        System.out.println("Page Count: " + firstBook.getPageCount());
        System.out.println("Year: " + firstBook.getYear());

        Book secondBook = new Book();

        secondBook.setTitle("Second Java Guru Book");

        System.out.println("Title: " + secondBook.getTitle());
    }

}
