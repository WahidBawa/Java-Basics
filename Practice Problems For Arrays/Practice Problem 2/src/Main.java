import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vals = {1,2,3,4,5};
        int total = 0;
        for (int i : vals){
            total += i;
        }
        System.out.println(Arrays.toString(vals));
        System.out.println(total);
    }
}
