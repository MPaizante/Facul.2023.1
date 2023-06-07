package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Teste;

import academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resuldato = calculadora.divideDoisNumeros(20,2);
        System.out.println(resuldato);
        System.out.println(calculadora.divideDoisNumeros(20,2));

    }
}
