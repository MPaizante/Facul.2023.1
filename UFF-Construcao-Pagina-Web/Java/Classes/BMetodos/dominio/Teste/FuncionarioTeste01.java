package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Teste;

import academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String... args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Matheus";
        funcionario.idade = 24;
        funcionario.salarios = new double[]{3000, 3200, 3250};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
