import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\nMinutes: ");
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        int year = minutes / 525600;
        int remainder = minutes % 525600;
        int day = remainder / 1440;
        System.out.println(year + " years and " + day + " days!");
    }
}
