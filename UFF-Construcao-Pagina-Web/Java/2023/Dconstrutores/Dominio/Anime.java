package academy.devdojo.Dojo.Java.Classes.Dconstrutores.Dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int espisodios;

    private String genero;
    private String estudio;



    public Anime(String nome , String tipo, int espisodios, String genero){
        this();
        System.out.println("Dentro do construtor.");
        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
        this.genero = genero;

    }
    public Anime(String nome , String tipo, int espisodios, String genero,String estudio){
        this(nome,tipo,espisodios,genero); //tem que vir primeiro senão n funciona
        this.estudio = estudio;

    }

    public Anime(){
        System.out.println("Dentro do construtor sem Arugmentos.");
    }
    public void imprime(){
        System.out.println(getNome());
        System.out.println(getTipo());
        System.out.println(getEspisodios());
        System.out.println(this.genero);
        System.out.println(estudio);// pode ser tbm this.estudio


    }

    /*public void inic(String nome , String tipo, int espisodios){
        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
        }*/



    /*public void inic(String nome , String tipo, int espisodios, String genero){
        this.inic(nome,tipo,espisodios);
        this.genero = genero;
        }
        */





    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;

    }
    public String getNome(){
        return this.nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEspisodios(int espisodios){
        this.espisodios = espisodios;
    }
    public int getEspisodios(){
        return this.espisodios;
    }

}
