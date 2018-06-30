public class Main {z
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        Camera cam1 = new Camera();

        mach1.start();
        cam1.start();
        cam1.snap();

        // Upcasting
        Machine mach2 = cam1;
        mach2.start();

        // Downcasting
        Machine mach3 = new Camera();
        Camera cam2 = (Camera)mach3;
        cam2.snap();
    }
}
