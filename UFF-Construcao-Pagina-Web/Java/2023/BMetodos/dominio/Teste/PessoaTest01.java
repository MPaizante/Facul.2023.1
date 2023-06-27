package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Teste;

import academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String... args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Matheus");
        pessoa.setIdade(16);
       // pessoa.idade = 16;
        //pessoa.nome = "Jiraya";

       // pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
