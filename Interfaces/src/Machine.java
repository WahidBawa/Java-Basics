public class Machine implements Info {
    private int id = 7;

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }

    public void start(){
        System.out.println("Machine Started");
    }
}
