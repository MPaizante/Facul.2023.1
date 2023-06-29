package academy.devdojo.Dojo.Java.Classes.Gassociação.Teste;

import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Escola;
import academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio.Professor;

public class EcolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Matheus");
        Professor professor2 = new Professor("Paizante");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Walter", professores);
        escola.imprime();











    }
}
