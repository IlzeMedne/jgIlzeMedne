package lv.homework.lesson11;

import java.util.Comparator;

//Malacis -> Cool
public class NameComparator implements Comparator<Product> {
    // zinu, ka šis nebija prasīts
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
