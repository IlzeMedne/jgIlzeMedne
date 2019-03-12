package lv.homework.lesson4;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        int wavelength = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String result = lightColorDetector.detect(wavelength);

        System.out.println("Ja gaismas viļņa garums ir "
                + wavelength + ", tad " + result);

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.shouldLightIsViolet();
        test.shouldLightIsBlue();
        test.shouldLightIsGreen();
        test.shouldLightIsYellow();
        test.shouldLightIsOrange();
        test.shouldLightIsRed();
        test.shouldLightIsNotVisible();
    }

    public void shouldLightIsViolet() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(444);

        compareResult(result.equals("gaisma ir violētā krāsā"), "shouldLightIsViolet");
    }

    public void shouldLightIsBlue() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(460);

        compareResult(result.equals("gaisma ir zilā krāsā"), "shouldLightIsBlue");
    }

    public void shouldLightIsGreen() {
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(562);

        compareResult(result.equals("gaisma ir zaļā krāsā"), "shouldLightIsGreen");
    }

    public void shouldLightIsYellow() {
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(584);

        compareResult(result.equals("gaisma ir dzeltenā krāsā"), "shouldLightIsYellow");
    }

    public void shouldLightIsOrange() {
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(595);

        compareResult(result.equals("gaisma ir oranžā krāsā"), "shouldLightIsOrange");
    }

    public void shouldLightIsRed() {
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(644);

        compareResult(result.equals("gaisma ir sarkanā krāsā"), "shouldLightIsRed");
    }

    public void shouldLightIsNotVisible() {
        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(800);

        compareResult(result.equals("gaisma nav redzama"), "shouldLightIsNotVisible");
    }

    void compareResult(boolean result, String testName) {

        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
