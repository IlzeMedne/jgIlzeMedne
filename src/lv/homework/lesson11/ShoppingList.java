package lv.homework.lesson11;

import java.util.*;

//Ok
public class ShoppingList implements Repository<Product> {

    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteByName(String name) {
        products.removeIf((Product prod) -> prod.getName() == name); //:D google ja - vai zini kā šo onstrukciju sauc? ;)
    }

    public void printAllList(String message) {
        List<Product> allList = new ArrayList<>(products);  // šī darbība nav nepieciešama - Tev jau ir ArrayList
        System.out.println("\nShopping list: " + message + allList);
    }

    @Override
    public List<Product> fitToPriceRange(Double priceAt, Double priceTo) {
        List<Product> filteredList = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= priceAt && product.getPrice() <= priceTo) {
                filteredList.add(product);
            }
        }
        return filteredList;
    }

    @Override
    public List<Product> containsCategory(Category category) {
        List<Product> filteredList = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory() == category) {
                filteredList.add(product);
            }
        }
        return filteredList;
    }

    // Zinu, ka šis nebija prasīts
    public void sortByName() {
        products.sort(new NameComparator());
    }

    public void sortByCategory() {
        products.sort(new CategoryComparator());
    }
}
