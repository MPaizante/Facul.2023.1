package academy.devdojo.Dojo.Java.Classes.LclassesAbstratas.Dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    @Override
    public void imprime(){
        System.out.println("Imprimindo...");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public void calculaBonus(){
        this.salario = salario + salario* 0.1;
    }













    }

