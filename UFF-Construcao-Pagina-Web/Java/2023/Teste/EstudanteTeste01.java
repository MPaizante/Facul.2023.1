package academy.devdojo.Dojo.Java.Classes.Teste;

import academy.devdojo.Dojo.Java.Classes.Dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante= new Estudante() ;
        estudante.nome ="Matheus";
        estudante.idade = 24;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
