class Thing{
    public String name;
    public final static int description = 100;
    public Thing(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class Static {
    public static void main(String[] args) {
        Thing thing1 = new Thing("Bob");
        Thing thing2 = new Thing("Bar");
        System.out.println(thing1.getName());
        System.out.println(thing2.getName());
        System.out.println(Thing.description);
    }
}
