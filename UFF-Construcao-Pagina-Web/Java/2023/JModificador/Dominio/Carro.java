package academy.devdojo.Dojo.Java.Classes.JModificador.Dominio;

public class Carro {
    public static final double velocidadeLimite = 250;
    public final Comprador COMPRADOR = new Comprador();
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
