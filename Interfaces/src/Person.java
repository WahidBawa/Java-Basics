public class Person implements Info{
    private String name;

    @Override
    public void showInfo() {
        System.out.println("My name is " + name);
    }

    public Person(String name){
        this.name =  name;
    }
    public void greet(){
        System.out.println("Hello There");
    }
}
