public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Pilot pilot = new Pilot();

        driver.fly();
        driver.drive();
        pilot.fly();
        pilot.drive();
    }
}