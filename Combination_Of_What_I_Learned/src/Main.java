import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<Character>();
//        ArrayList<Object> chars = new ArrayList<Object>(); // For all objects
        Enemy enemy = new Enemy("Zeke", 10, 125);
//        enemy = new Enemy("Z", 12, 200); // This is for if you want to override a variable
        Player player = new Player("Yoh", 11, 150);
        chars.add(enemy);
        chars.add(player);
        System.out.println(chars.get(0)); // .get(int index) is for the individual items in an ArrayList
        for (Character i : chars) {
            System.out.println(i.getName());
        }

        boolean bool = true;
        while (bool) {
            Scanner input = new Scanner(System.in);
            System.out.printf("\nEnter a command: ");
            String text = input.nextLine();
            switch (text) {
                case "change-name":
                    boolean change_name = true;
                    while (change_name) {
                        input = new Scanner(System.in);
                        System.out.printf("\nEnter a new name: ");
                        text = input.nextLine();
                        change_name = false;
                        switch (text) {
                            default:
                                System.out.println(chars.get(0).getName());
                                chars.get(0).setName(text);
                                System.out.println(chars.get(0).getName());
                        }
                    }
                    continue;
                case "print-all-names":
                    for (Character i : chars){
                        System.out.println(i.getName());
                    }
                    continue;
                case "end":
                    bool = false;
                    break;
                case "exit":
                    bool = false;
                    break;
            }
        }

    }
}
