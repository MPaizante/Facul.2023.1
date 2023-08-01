package academy.devdojo.Dojo.Java.Classes.Npolimorfismo.Dominio;

public abstract class Produto implements Taxavel{
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }


}
