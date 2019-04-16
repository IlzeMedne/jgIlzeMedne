package lv.homework.lesson8.car2;

import java.util.Objects;

public class Bus extends Car {

    private int passengersSeats;

    public Bus(String color, String manufacturer, int year, int passengersSeats) {
        super(color, manufacturer, year);
        this.passengersSeats = passengersSeats;
    }

    //nezvai šāda toString izvade būs viegli lasāma, labak super klaases laukus manuāli iekļaut
    @Override
    public String toString() {
        return "Bus: " +
                "\npassenger seats: " + passengersSeats
                + super.toString();
    }
    // man šādi tieši liekās forši izmantot mantošanu,
    // jo nav vēlreiz jāprarraksta tas, kas jau vienreiz rakstīts un derīgs visiem.
    // Mazliet pamainīju veidu kā parādās konsolē un
    // klasē Truck izmainīju super.toString uz getColor utt. lai var redzēt, ka tā arī var izdarīt  :)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengersSeats == bus.passengersSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersSeats);
    }
}