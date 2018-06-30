class Apple{
    private int id;
    private String name;

    public Apple(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
//        StringBuilder sb = new StringBuilder();
//        sb.append(id).append(": ").append(name);
//        return sb.toString();
        return String.format("%-4d: %s", id, name);
    }
}
public class ObjectClasses {
    public static void main(String[] args) {
        Object obj = new Object();
        Apple apple1 = new Apple(7000, "Bob");
        Apple apple2 = new Apple(5, "Roger");
        System.out.println(apple1);
        System.out.println(apple2);
    }
}
