import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("\nEnter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String number = String.valueOf(num);
        char[] digits = number.toCharArray();
        int total = 0;
        for(char i : digits){
            total += Character.getNumericValue(i);
        }
        System.out.println(total);
    }
}
