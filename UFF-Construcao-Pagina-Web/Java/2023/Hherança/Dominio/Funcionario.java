package academy.devdojo.Dojo.Java.Classes.Hherança.Dominio;

public class Funcionario extends Pessoa {


    private double salario;

    static {
        System.out.println("Dentro de estatico funcionario");
    }
    {
        System.out.println("N estatico funcionario 1 ");
    }
    {
        System.out.println("N estatico funcionario 2");
    }

    public Funcionario(String nome){

        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
