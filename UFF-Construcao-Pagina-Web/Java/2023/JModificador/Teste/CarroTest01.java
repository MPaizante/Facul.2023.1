package academy.devdojo.Dojo.Java.Classes.JModificador.Teste;

import academy.devdojo.Dojo.Java.Classes.JModificador.Dominio.Carro;
import academy.devdojo.Dojo.Java.Classes.JModificador.Dominio.Comprador;
import academy.devdojo.Dojo.Java.Classes.JModificador.Dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        System.out.println(Carro.velocidadeLimite);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Mattheyus");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();


    }
}
