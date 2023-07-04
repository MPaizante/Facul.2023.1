package academy.devdojo.Dojo.Java.Classes.Gassociação.Teste;

import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Aluno;
import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Local;
import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Professor;
import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Seminario;

public class AssociaçãoTest {
    public static void main(String[] args) {
        Local local = new Local("Itauna");
        Aluno aluno = new Aluno("Matheus", 24);
        Professor professor = new Professor("Paizante", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("XXXX", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}
