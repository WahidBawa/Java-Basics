import java.util.Scanner;
public class Scanner_Switch {
    public static void main(String[] args) {
        boolean bool = true;
        do{
            Scanner input = new Scanner(System.in);
            System.out.printf("Enter a line: ");
            String text = input.nextLine();
            bool = false;
            switch (text){
                case "start":
                    System.out.println("STARTED");
                    break;
                case "end":
                    System.out.println("ENDED");
                    break;
                default:
                    System.out.println("KEEP ON GOING");
                    bool = true;
            } // Switch end
        }while(bool); // While end
    }
}
