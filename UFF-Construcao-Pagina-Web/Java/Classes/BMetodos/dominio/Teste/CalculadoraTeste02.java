package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Teste;

import academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(30 , 5);
        System.out.println(calculadora);
    }
}
