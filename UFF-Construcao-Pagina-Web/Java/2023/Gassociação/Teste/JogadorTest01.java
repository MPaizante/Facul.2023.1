package academy.devdojo.Dojo.Java.Classes.Gassociação.Teste;

import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Matheus");
        Jogador jogador2 = new Jogador("Paizante");
        Jogador jogador3 = new Jogador("Araujo");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};


        for (Jogador jogador:jogadores) {
            jogador.imprime();

        }


    }
}
