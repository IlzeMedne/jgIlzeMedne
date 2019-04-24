package lv.homework.lesson11;

import java.util.List;

//OK
public interface Repository<T> {

    void addProduct(T product);

    void deleteByName(String name);

    void printAllList(String message);

    List<T> fitToPriceRange(Double priceAt, Double priceTo);

    List <T> containsCategory(Category category);






}
