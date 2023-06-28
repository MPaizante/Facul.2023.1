package academy.devdojo.Dojo.Java.Classes.FmodificarEstatico.Dominio;

public class Carro {
    private String nome;
    private String marca;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;


    public void imprime(){
        System.out.println("------------------------------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Marca "+ this.marca);
        System.out.println("Velocidade máxima "+ this.velocidadeMaxima);
        System.out.println("Velocidade limite "+ this.velocidadeLimite);



    }

    public Carro(String nome, String marca, double velocidadeMaxima) {
        this.nome = nome;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /*public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }*/
}
