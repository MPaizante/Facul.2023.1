package academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Teste;

import academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio.Estudante;
import academy.devdojo.Dojo.Java.Classes.BMetodos.dominio.Dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Matheus";
        estudante01.idade = 24;
        estudante01.sexo = 'M';

        estudante02.nome = "Paizante";
        estudante02.idade = 26;
        estudante02.sexo = 'M';



        impressora.imprime(estudante01);
        impressora.imprime(estudante02);







    }
}
