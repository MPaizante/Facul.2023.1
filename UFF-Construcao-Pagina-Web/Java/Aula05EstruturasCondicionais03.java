package academy.devdojo.Dojo.Java;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double SalAnual = 10000;

        double primeira = 9.70/100;
        double segunda = 37.35/100;
        double terceira = 49.5/100;

        double VI;

        if(SalAnual <= 34712){
            VI = SalAnual * primeira;
        }else if (SalAnual >= 34713 && SalAnual <= 68507){
            VI = SalAnual * segunda;
        }else {
            VI = SalAnual * terceira;
        }
        System.out.println("Seu imposto a ser pago será de "+VI +" e seu Salario é de: "+SalAnual);
    }
}
