import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\nInput Temperature in Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        int f = input.nextInt();
        double celcius = (f - 32) * (.5556);
        System.out.println(celcius);
    }
}
