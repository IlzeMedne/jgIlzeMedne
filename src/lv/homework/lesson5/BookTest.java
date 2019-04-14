package lv.homework.lesson5;

public class BookTest {

    public static void main(String[] args) {

        testBookEquals();
        testBookNotEquals();
        testBookToString();
    }

    private static void testBookNotEquals() {
        Book secondBook = new Book("Paulo Coelho", "The Fifth Mountain", 245);
        Book thirdBook = new Book("Imants Ziedonis", "Epifānijas", 198);

        boolean expectedEquals = true;

        System.out.println("Object NOT equals true Test: ");
        boolean actualCompareSecondAndThird = secondBook.equals(thirdBook);
        if (actualCompareSecondAndThird) {
            System.out.println("Test PASSED, objects are equal");
        } else {
            System.out.println("Test FAILED, objects are not equal");
            System.out.println("Expected: " + expectedEquals);
            System.out.println("Actual: " + actualCompareSecondAndThird);
        }
        System.out.println();
    }

    private static void testBookEquals() {

        Book firstBook = new Book("Paulo Coelho", "The Fifth Mountain", 245);
        Book secondBook = new Book("Paulo Coelho", "The Fifth Mountain", 245);

        boolean expectedEquals = true;

        System.out.println("Object equals true Test: ");
        boolean actualCompareFirstAndSecond = firstBook.equals(secondBook);
        if (actualCompareFirstAndSecond) {
            System.out.println("Test PASSED, objects are equal");
        } else {
            System.out.println("Test FAILED, objects are not equal");
            System.out.println("Expected: " + expectedEquals);
            System.out.println("Actual: " + actualCompareFirstAndSecond);
        }
        System.out.println();
    }

    private static void testBookToString() {
        Book book = new Book("Paulo Coelho", "The Fifth Mountain", 245);

        String expected = "Book: {author = Paulo Coelho, title = The Fifth Mountain, page count = 245}";

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