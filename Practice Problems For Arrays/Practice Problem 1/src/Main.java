import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,9,8,7,4,5,6,3,2,1,10};
        String[] words = {"a", "B"};
        Arrays.sort(nums);
        Arrays.sort(words);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(words));
    }
}
