import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\nInches to Meters: ");
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double meters = inches * .0254;
        System.out.println("Meters: " + meters);
    }
}
