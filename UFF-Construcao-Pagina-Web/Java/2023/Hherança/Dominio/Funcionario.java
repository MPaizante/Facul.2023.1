package academy.devdojo.Dojo.Java.Classes.Hherança.Dominio;

public class Funcionario extends Pessoa {

    private double salario;


    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
