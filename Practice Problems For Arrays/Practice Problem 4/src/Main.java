public class Main {
    public static void main(String[] args) {
        int[] vals = {81,75,99,65,90,90,94,74};
        int total = 0;
        for (int i : vals){
            total += i;
        }
        double avg = (double)total / vals.length;
        System.out.println(avg);
    }
}
