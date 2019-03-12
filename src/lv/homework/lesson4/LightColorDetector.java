package lv.homework.lesson4;

public class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength < 450) {
            return "gaisma ir violētā krāsā";
        } else if (wavelength >= 450 && wavelength < 495) {
            return "gaisma ir zilā krāsā";
        } else if ((wavelength >= 495) && (wavelength < 570)) {
            return "gaisma ir zaļā krāsā";
        } else if ((wavelength >= 570) && (wavelength < 590)) {
            return "gaisma ir dzeltenā krāsā";
        } else if ((wavelength >= 590) && (wavelength < 620)) {
            return "gaisma ir oranžā krāsā";
        } else if ((wavelength >= 620) && (wavelength < 750)) {
            return "gaisma ir sarkanā krāsā";
        } else {
            return "gaisma nav redzama";
        }

    }
}