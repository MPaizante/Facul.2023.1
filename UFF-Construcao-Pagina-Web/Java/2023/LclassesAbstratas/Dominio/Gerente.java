package academy.devdojo.Dojo.Java.Classes.LclassesAbstratas.Dominio;


public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);


    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
