public class Car extends Machine{
    public void wipeWindShield(){
        System.out.println("Wiping Windshield");
    }

    @Override
    public void start() {
        System.out.println("Car Started");
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void stop() {
        System.out.println("Car Started");

    }
}
