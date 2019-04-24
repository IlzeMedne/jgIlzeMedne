package lv.homework.lesson11;

public enum Category {

    FOOD("food"),
    CLOTHES("clothes"),
    HOUSEHOLD("household goods");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
