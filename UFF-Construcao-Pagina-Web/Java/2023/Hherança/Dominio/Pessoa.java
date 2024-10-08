package academy.devdojo.Dojo.Java.Classes.Hherança.Dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;

    protected Endereço endereço;

    static {
        System.out.println("Dentro de estatico pessoa");
    }
    {
        System.out.println("N estatico pessoa 1 ");
    }
    {
        System.out.println("N estatico pessoa 2");
    }

    public Pessoa(String nome){

        System.out.println("Dentro do construtor pessoa");
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }




    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereço.getRua() + " "+this.endereço.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
