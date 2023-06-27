package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Teste;

import academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int b1 = 1;
        int b2 = 2;
        calculadora.alteraDoisNumeros(b1, b2);
        System.out.println(b1);
        System.out.println(b2);


    }
}
