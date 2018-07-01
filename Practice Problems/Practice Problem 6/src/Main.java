import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\nEnter weight in pounds: ");
        Scanner input1 = new Scanner(System.in);
        double weight = input1.nextFloat();

        System.out.printf("\nEnter height in inches: ");
        Scanner input2 = new Scanner(System.in);
        double height = input2.nextFloat();
        double bmi = (weight / height / height) * 703;
        System.out.println(bmi);
    }
}
