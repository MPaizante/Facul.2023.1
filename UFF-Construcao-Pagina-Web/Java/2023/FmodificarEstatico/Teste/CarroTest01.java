package academy.devdojo.Dojo.Java.Classes.FmodificarEstatico.Teste;

import academy.devdojo.Dojo.Java.Classes.FmodificarEstatico.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("C1","BMW",280);
        Carro c2 = new Carro("C2", "Mercedes",300);
        Carro c3 = new Carro("C3", "Audi", 290);
        Carro.setVelocidadeLimite(240);
        c1.imprime();
        c2.imprime();
        c3.imprime();




    }
}
