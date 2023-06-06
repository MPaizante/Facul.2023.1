package academy.devdojo.Dojo.Java;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //1d 7s
        byte dia = 1;
    switch (dia){
        case 1 :
            System.out.println("Domingo");
            System.out.println("Folga");
            break;
        case 2:
            System.out.println("Segunda");
            System.out.println("Dia útil");
            break;
        case 3:
            System.out.println("Terça");
            System.out.println("Dia útil");
            break;
        case 4:
            System.out.println("Quarta");
            System.out.println("Dia útil");
            break;
        case 5:
            System.out.println("Quinta");
            System.out.println("Dia útil");
            break;
        case 6:
            System.out.println("Sexta");
            System.out.println("Dia útil");
            break;
        case 7:
            System.out.println("Sábado");
            System.out.println("Folga");
            break;
        default:
            System.out.println("Digite o dia certo!");
            break;

    }
    }

}
