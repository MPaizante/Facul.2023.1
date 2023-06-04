package academy.devdojo.Dojo.Java;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double SalAnual = 10000;

        double primeira = 9.70/100;
        double segunda = 37.35/100;
        double terceira = 49.5/100;

        double VI;
        if(SalAnual <= 34712){
            SalAnual = SalAnual * primeira;
        }else if (SalAnual >= 34713 && SalAnual <= 68507){
            SalAnual = SalAnual * segunda;
        }else {
            SalAnual = SalAnual * terceira;
        }
        System.out.println("Seu imposto a ser pago será de "+SalAnual);
    }
}
