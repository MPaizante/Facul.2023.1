package academy.devdojo.Dojo.Java.Classes.EblocosInicialização.Teste;

import academy.devdojo.Dojo.Java.Classes.EblocosInicialização.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio: anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }

    }
}
