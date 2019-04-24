package lv.homework.lesson11;

import java.util.Comparator;

//Malacis -> Cool
public class CategoryComparator implements Comparator<Product> {
    //Zinu, ka šis nebija parasīts:
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}
