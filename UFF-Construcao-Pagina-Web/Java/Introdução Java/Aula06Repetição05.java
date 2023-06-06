package academy.devdojo.Dojo.Java;

public class Aula06Repetição05 {

    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela = parcela - 1){
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000){
                continue;
            }

            System.out.println(parcela);
            System.out.println(valorParcela);

        }
    }

}
