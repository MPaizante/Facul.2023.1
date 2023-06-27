package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio;

public class Pessoa {
    private String nome;
    private   int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int x){
        if(x <0){
            System.out.println("Idade invalida");
            return;
        }
        idade = x;//pode fazer dos dois jeitos, é referencia.
    }

    public String  getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
