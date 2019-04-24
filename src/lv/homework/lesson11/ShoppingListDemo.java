package lv.homework.lesson11;

public class ShoppingListDemo {

    public static void main(String[] args) {
        ShoppingList myShoppingList = new ShoppingList();

        myShoppingList.addProduct(new Product(Category.FOOD, "apple", 0.85));
        myShoppingList.addProduct(new Product(Category.FOOD, "bred", 1.57));
        myShoppingList.addProduct(new Product(Category.FOOD, "milk", 1.28));
        myShoppingList.addProduct(new Product(Category.CLOTHES, "dress", 30.99));
        myShoppingList.addProduct(new Product(Category.HOUSEHOLD, "shampoo", 7.60));

        myShoppingList.printAllList("New: ");

        myShoppingList.deleteByName("apple");
        myShoppingList.deleteByName("milk");
        myShoppingList.printAllList("After deleted products: ");

        myShoppingList.addProduct(new Product(Category.FOOD, "apple", 0.85));
        myShoppingList.addProduct(new Product(Category.FOOD, "apple", 1.52));
        myShoppingList.addProduct(new Product(Category.CLOTHES, "socks", 7.50));
        myShoppingList.printAllList("After adding new products: ");

        System.out.println("\nShopping list of selected category"
                + myShoppingList.containsCategory(Category.FOOD));
        System.out.println("\nShopping list of selected category"
                + myShoppingList.containsCategory(Category.CLOTHES));

        myShoppingList.printAllList("All list after filtering (just wanted to check): ");

        System.out.println("\nShopping list of selected price category:"
                + myShoppingList.fitToPriceRange(1.5, 7.5));

        System.out.println("\nZinu, ka šis nebija prasīts :)");
        myShoppingList.sortByName();
        myShoppingList.printAllList("Sorted list by product name: ");
        myShoppingList.sortByCategory();
        myShoppingList.printAllList("Sorted list by product category: ");

        myShoppingList.deleteByName("apple");
        myShoppingList.printAllList("Sorted list after deleting 'apple': ");


    }
}
