package lv.homework.lesson11;

import java.util.Objects;

public class Product {

    private Category category;
    private String name;
    private double price;

    public Product(Category category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                category == product.category &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price);
    }

    @Override
    public String toString() {
        return "\n" + category.getValue() +
                " - " + name +
                ", price: " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
