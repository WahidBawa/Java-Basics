public class Machine {
    private String name;
    public Machine(String name){
        this.name = name;
    }
    public void start() {
        System.out.println("Machine Started");
    }

    public void stop() {
        System.out.println("Machine Stopped");
    }
    public String getName(){
        return name;
    }
}
