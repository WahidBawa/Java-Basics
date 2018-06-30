public class Plant {
    public String name; // this is bad practice
    public final static int ID = 8; // this is acceptable practice sonce it is constant and final

    private String type;

    protected String size;

    public Plant() {
        name = "Freddie";
        type = "Tree";
        size = "Medium";
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
