package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }


    public void subtraiDoisNumeros() {
        System.out.println(30 - 4);
    }


    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }


    public double divideDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return (n1 / n2);
    }

    public double divideDoisNumeros02(double n01, double n02) {

        if (n02 == 0) {
            return 0;
        } else {
            return (n01 / n02);
        }
    }


    public void imprimeDivisãoDeDoisNumeros(double m1, double m2) {
        if (m2 == 0) {
            System.out.println("N existe!");
            return;
        } else {
            System.out.println(m1 / m2);
        }
    }


    public void alteraDoisNumeros(int b1, int b2) {
        b1 = 99;
        b2 = 33;
        System.out.println("Dentro do Altera dois Nuemros");
        System.out.println("B1 " + b1);
        System.out.println("B2 " + b2);
    }
    public void somaArray( int [] numeros){
        int soma = 0;
        for(int num: numeros ){
            soma += num;
        }
        System.out.println(soma);
    }

    public void  somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros ){
            soma += num;
        }
        System.out.println(soma);
    }
}
