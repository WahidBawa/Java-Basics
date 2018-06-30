public class Main {
    public static void main(String[] args) {
        Machine mach1 = new Machine("Bert");

        mach1.start();
        mach1.stop();
        System.out.println(mach1.getName());
        Car car1 = new Car("Ernie");
        car1.start();
        car1.wipeWindShield();
        car1.stop();
        System.out.println(car1.getName());
    }
}
