package academy.devdojo.Dojo.Java.Classes.JModificador.Dominio;

public class Comprador {
    private String nome;


    @Override
    public String toString() {
        return "Comprador" +
                "nome='" + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
