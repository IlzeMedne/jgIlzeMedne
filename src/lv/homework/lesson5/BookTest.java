package lv.homework.lesson5;

public class BookTest {

    public static void main(String[] args) {

        testBookEquals();
        testBookToString();


    }

    private static void testBookEquals() {

        Book firstBook = new Book();
        firstBook.setAuthor("Paulo Coelho");
        firstBook.setTitle("The Fifth Mountain");
        firstBook.setPageCount(245);

        Book secondBook = new Book();
        secondBook.setAuthor("Paulo Coelho");
        secondBook.setTitle("The Fifth Mountain");
        secondBook.setPageCount(245);

        boolean expectedEquals = true;

        System.out.println("Object equals true Test: ");
        boolean actual = firstBook.equals(secondBook);
        if (actual) {
            System.out.println("Test PASSED, objects are equal");
        } else {
            System.out.println("Test FAILED, objects are not equal");
            System.out.println("Expected: " + expectedEquals);
            System.out.println("Actual: " + actual);
        }
        System.out.println();

    }

    private static void testBookToString() {

        Book book = new Book();
        book.setAuthor("Paulo Coelho");
        book.setTitle("The Fifth Mountain");
        book.setPageCount(245);

        String expected = "Book: {author = " + book.getAuthor() +
                ", title = " + book.getTitle() +
                ", page count = " + book.getPageCount() + "}";

// vai pareizāk rakstīt uzreiz bez getteriem sagaidāmo rezultātu šādi:?
        //String expected = "Book: {author = Paulo Coelho, title = The Fifth Mountain, page count = 245}";


        System.out.println("ToString Test: ");

        if (expected.equals(book.toString())) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Expected:" + expected);
            System.out.println("Actual: " + book);
        }


    }
}
