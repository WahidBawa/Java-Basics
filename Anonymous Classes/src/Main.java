public class Main {
    public static void main(String[] args) {
        Machine mach1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Camera Snapping");
            }
        };
        mach1.start();
    IPlant p = new IPlant() {
        @Override
        public void grow() {
            System.out.println("Growing");
        }
    };
    p.grow();
    }
}
