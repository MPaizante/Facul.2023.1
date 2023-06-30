package academy.devdojo.Dojo.Java.Classes.Gassociação.Teste;

import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Jogador;
import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {


        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Péle");

        Time time = new Time("Brasil");


        Jogador[] jogadores = {jogador,jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);


        time.setJogadores(jogadores);

        System.out.println("------------------Jogador--------------");

        jogador.imprime();

        System.out.println("------------------Time--------------");

        time.imprime();















    }
}
