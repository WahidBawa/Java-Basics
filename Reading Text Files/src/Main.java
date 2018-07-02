import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
//        File filename = new File("C:/Users/wahid/Desktop/seuss.txt");
        File filename = new File("src/seuss.txt");

        Scanner text = new Scanner(filename);
        ArrayList<String[]> strings = new ArrayList<>();
        while (text.hasNextLine()){
            String[] line = text.nextLine().split(" ");
            strings.add(line);
            System.out.println(Arrays.toString(line));
        }
//        System.out.println(Arrays.toString(strings));
        text.close();
    }
}
