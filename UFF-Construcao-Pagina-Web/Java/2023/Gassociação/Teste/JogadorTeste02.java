package academy.devdojo.Dojo.Java.Classes.Gassociação.Teste;

import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Jogador;
import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Matheus");

        Time time = new Time("Botafogo!");

        jogador1.setTime(time);
        jogador1.imprime();






    }
}
