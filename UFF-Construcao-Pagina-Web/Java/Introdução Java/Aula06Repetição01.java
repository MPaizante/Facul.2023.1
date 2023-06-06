package academy.devdojo.Dojo.Java;

public class Aula06Repetição01 {
    public static void main(String[] args) {
        int c = 1;
        int b = 1;
        while (c <=10){

            System.out.println(c);
            c = c + 1;
        }

        do {
            System.out.println("Dentro do 'do-while'. " + b);
            b = b + 1;
        }while (b <=10);


        for (int a = 1 ; a<=10 ; a = a + 1){
            System.out.println("Matheus "+ a);

        }


    }
}
