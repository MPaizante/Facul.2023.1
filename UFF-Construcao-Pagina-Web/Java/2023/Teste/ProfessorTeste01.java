package academy.devdojo.Dojo.Java.Classes.Teste;

import academy.devdojo.Dojo.Java.Classes.Dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Matheus";
        professor.idade = 24;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " anos Sexo:" + professor.sexo);
    }
}
