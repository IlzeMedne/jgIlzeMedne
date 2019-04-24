package lv.homework.lesson10;

public class UserValidationService {

    private String name;
    private String lastName;
    private Integer age;

    //validačijas loģika jāines atsevišķā metodē
    public UserValidationService(String name, String lastName, Integer age) {
        if (name.length() < 3 || name.length() > 15) {
            throw new ValidationException("Name length should be 3 - 15 characters");
        }
        this.name = name;
        if (lastName.length() < 3 || lastName.length() > 15) {
            throw new ValidationException("Last Name length should be 3 - 15 characters");
        }
        this.lastName = lastName;
        if (age < 0 || age > 120) {
            throw new ValidationException("Age can not be less than 0 and more than 120");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: " +
                "\nName:" + name +
                "\nLast Name: " + lastName +
                "\nage: " + age;
    }
}
