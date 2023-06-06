package academy.devdojo.Dojo.Java;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int [] numeros2 = {1,28,3,4,5};
        int [] n3 = new int[]{10,20,30,40,50};


        for (int i = 0; i <n3.length;i++){
            System.out.println(n3[i]);
        }
        for(int n:n3){
            System.out.println(n);
        }
    }
}
