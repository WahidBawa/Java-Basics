public class Main {
    public static void main(String[] args) {
        int[] vals = {81,75,65,74,90,90,94,99};
        System.out.println(isInsideArray(vals, 90));
        System.out.println(indexOfItem(vals, 90));
    }
    static boolean isInsideArray(int[] list, int num){
        for (int i : list){
            if (i == num){
                return true;
            }
        }
        return false;
    }
    static int indexOfItem(int[] list, int num){
        for (int i = 0; i < list.length; i++){
            if (list[i] == num){
                return i;
            }
        }
        return -1;
    }
}

