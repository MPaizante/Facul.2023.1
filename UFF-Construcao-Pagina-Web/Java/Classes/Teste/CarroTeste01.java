package academy.devdojo.Dojo.Java.Classes.Teste;

import academy.devdojo.Dojo.Java.Classes.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Corsa";
        carro1.ano = 2010;
        carro1.modelo = "Sedan";
        System.out.println("O nome do carro é o famoso " + carro1.nome + " fabricado no ano de " + carro1.ano + " Modelo " + carro1.modelo);



        Carro carro2 = new Carro();
        carro2.nome = "Palio";
        carro2.ano = 2008;
        carro2.modelo = "Sport";
        System.out.println("O nome do carro é o famoso " + carro2.nome + " fabricado no ano de " + carro2.ano + " Modelo " + carro2.modelo);

        carro1 = carro2;

        System.out.println("O nome do carro é o famoso " + carro1.nome + " fabricado no ano de " + carro1.ano + " Modelo " + carro1.modelo);


    }
}

