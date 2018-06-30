public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(plant.ID);
        Oak oak = new Oak();
        System.out.println(oak.getType());
        oak.setType("Changed Tree");
        System.out.println(oak.getType());
        System.out.println(plant.size);
    }
}
