package academy.devdojo.Dojo.Java;

public class Aula06Repetição04 {
    public static void main(String[] args) {
        double car = 50000;
        for (int c = 1;c <= car; c=  c+1){
            double VP  = car / c;
            if(VP >= 1000) {
                System.out.println("Parcela " + c + "x de R$: " + VP);

            }else{
                break;
            }
        }
    }
}
