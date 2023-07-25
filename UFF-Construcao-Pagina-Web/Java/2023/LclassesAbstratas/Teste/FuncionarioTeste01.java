package academy.devdojo.Dojo.Java.Classes.LclassesAbstratas.Teste;

import academy.devdojo.Dojo.Java.Classes.LclassesAbstratas.Dominio.Desenvolvedor;
import academy.devdojo.Dojo.Java.Classes.LclassesAbstratas.Dominio.Funcionario;
import academy.devdojo.Dojo.Java.Classes.LclassesAbstratas.Dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nt", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mt",12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
