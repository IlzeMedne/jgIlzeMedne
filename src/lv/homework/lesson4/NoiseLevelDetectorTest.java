package lv.homework.lesson4;

public class NoiseLevelDetectorTest {
    public static void main(String[] args) {
        NoiseLevelDetector noiseLevelDetector = new NoiseLevelDetector();

        String result = noiseLevelDetector.detect(500);
        System.out.println("Result: " + result);

        NoiseLevelDetectorTest test = new NoiseLevelDetectorTest();
        test.shouldDetectJackhammer();
        test.shouldDetectGasLawnmower();
        test.shouldDetectAlarmClock();
        test.shouldDetectQuietRoom();
    }

    public void shouldDetectJackhammer(){
        NoiseLevelDetector detector = new NoiseLevelDetector();

        String result = detector.detect(300);
        compareResult(result.equals("Jackhammer"),"shouldDetectJackhammer");
    }

    public void shouldDetectGasLawnmower(){

        NoiseLevelDetector detector = new NoiseLevelDetector();

        String result = detector.detect(95);
        compareResult(result.equals("Gas lawnmower"),"shouldDetectGasLawnmower");
    }

    public void shouldDetectAlarmClock(){

        NoiseLevelDetector detector = new NoiseLevelDetector();

        String result = detector.detect(40);
        compareResult( result.equals("Alarm clock"),"shouldDetectAlarmClock");
    }

    public void shouldDetectQuietRoom(){
        NoiseLevelDetector detector = new NoiseLevelDetector();
        String result = detector.detect(5);

        compareResult(result.equals("Quiet room"),"shouldDetectQuietRoom");
    }

    void compareResult(boolean result, String testName) {
        if (result){
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}