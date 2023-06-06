package academy.devdojo.Dojo.Java;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {

        int [] ar = {1,2,3};

        int[][] a = new int[3][];

        a [0] = new int[]{1,2};
        a [1] = ar;
        a [2] = new int[]{1,2,3,4,5,6};


        int [] [] arrayInt2 = {{0,0},{1,2},{2,3}};

        for (int[] ab:arrayInt2){
            System.out.println("\n-------");
            for (int num:ab){

                System.out.print(" "+num);
            }
        }
        for (int[] b:a){
            System.out.println("\n-------");
            for (int n:b){

                System.out.print(" "+n);
            }
        }
    }
}
