class Machine {
    private String name;
    public Machine(){
        this("Ernie");
    }
    public Machine(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("BERT");
        System.out.println(machine1.getName());
        System.out.println(machine2.getName());
    }
}
