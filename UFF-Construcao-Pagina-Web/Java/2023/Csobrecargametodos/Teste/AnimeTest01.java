package academy.devdojo.Dojo.Java.Classes.Csobrecargametodos.Teste;

import academy.devdojo.Dojo.Java.Classes.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.inic("Mateus", "Tv", 17);
        anime.inic("Paizante", "Serie", 22, "Drama");

        //anime.setNome("Matheus");
        //anime.setTipo("Tv");
        //anime.setEspisodios(12);
        anime.imprime();
    }
}
