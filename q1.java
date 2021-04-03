public class q1 {
    public static void main(String[] args) throws InterruptedException {
        ClockDisplay clockDisplay = new ClockDisplay();
        //clockDisplay.setTime(24,59,55);
        while ( true )
        {
            Thread.sleep(1000);
            clockDisplay.timeTick();
            System.out.println(clockDisplay.getTime());
        }
    }
}
