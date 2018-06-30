public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{10,20,30},{100,200,300}};
        for(int[] i: grid){
            for (int n : i){
                System.out.println(n);
            }
        }
        String[][] texts = new String[3][3];
        for (int i = 0; i < texts.length; i++){
            for (int n = 0; n < texts[i].length; n++){
                texts[i][n] = "hi";
            }
        }
        for (String[] i: texts){
            for (String n : i){
                System.out.println(n);
            }
        }
    }
}
