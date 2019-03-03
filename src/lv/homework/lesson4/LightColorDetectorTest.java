package lv.homework.lesson4;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        int wavelength = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String result = lightColorDetector.detect(wavelength);

        System.out.println("Ja gaismas viļņa garums ir "
                + wavelength + ", tad " + result);

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.shouldGaismaIrViolētāKrāsā();
        test.shouldGaismaIrZilāKrāsā();
        test.shouldGaismaIrZaļāKrāsā();
        test.shouldGaismaIrDzeltenāKrāsā();
        test.shouldGaismaIrOranžāKrāsā();
        test.shouldGaismaIrSarkanāKrāsā();
        test.shouldGaismaNavRedzama();
    }

    public void shouldGaismaIrViolētāKrāsā(){

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(444);

        compareResult(result.equals("gaisma ir violētā krāsā"),"shouldGaismaIrViolētāKrāsā");
    }

    public void shouldGaismaIrZilāKrāsā(){

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(460);

        compareResult(result.equals("gaisma ir zilā krāsā"),"shouldGaismaIrZilāKrāsā");
    }

    public void shouldGaismaIrZaļāKrāsā(){
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(562);

        compareResult(result.equals("gaisma ir zaļā krāsā"), "shouldGaismaIrZaļāKrāsā");
    }

    public void shouldGaismaIrDzeltenāKrāsā(){
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(584);

        compareResult(result.equals("gaisma ir dzeltenā krāsā"), "shouldGaismaIrDzeltenāKrāsā");
    }

    public void shouldGaismaIrOranžāKrāsā(){
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(595);

        compareResult(result.equals("gaisma ir oranžā krāsā"), "shouldGaismaIrOranžāKrāsā");
    }

    public void shouldGaismaIrSarkanāKrāsā(){
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(644);

        compareResult(result.equals("gaisma ir sarkanā krāsā"), "shouldGaismaIrSarkanāKrāsā");
    }

    public void shouldGaismaNavRedzama(){
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(800);

        compareResult(result.equals("gaisma nav redzama"), "shouldGaismaNavRedzama");
    }

    void compareResult(boolean result,String testName){

        if (result){
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
