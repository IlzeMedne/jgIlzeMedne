package lv.homework.lesson8.car;

import java.util.Objects;

//Tā kā ir jābūt kopīgām īpašībām(jeb stāvokļiem), tad ti ir jābūt parastai klasei
abstract class Car {

    abstract String color();

    abstract String manufacturer();

    abstract int year();

    @Override
    public String toString() {
        return "\nColor: " + color()
                + "\nManufacturer: " + manufacturer()
                + "\nYear: " + year();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car that = (Car) obj;
        return Objects.equals(color(), that.color()) &&
                Objects.equals(manufacturer(), that.manufacturer()) &&
                Objects.equals(year(), that.year());
    }
}