package lv.homework.lesson3;

public class ProductTest {

    public static void main(String[] args) {
        Product firstProduct = new Product();

        firstProduct.setName("milk");
        firstProduct.setRegularPrice(0.8);
        firstProduct.setDiscount(20);

        firstProduct.calculateActualPrice();

        System.out.println("Product: name = " + firstProduct.getName()
                + ", regular price = " + firstProduct.getRegularPrice()
                + " EUR, discount = " + firstProduct.getDiscount()
                + "%, actual price = " + firstProduct.calculateActualPrice() + " EUR");
    }
}
