package academy.devdojo.Dojo.Java.Classes.Hherança.Teste;

import academy.devdojo.Dojo.Java.Classes.Hherança.Dominio.Endereço;
import academy.devdojo.Dojo.Java.Classes.Hherança.Dominio.Funcionario;
import academy.devdojo.Dojo.Java.Classes.Hherança.Dominio.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setCep("24474-735");
        endereço.setRua("Liborina Silva");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Matheus");
        pessoa.setCpf("161.581.557-05");
        pessoa.setEndereço(endereço);
        pessoa.imprime();

        System.out.println("--------------------------");
        Funcionario funcionario = new Funcionario();
        Endereço endereço1 = new Endereço();
        endereço1.setRua("SG");
        endereço1.setCep("123456789");
        funcionario.setNome("Paizante");
        funcionario.setCpf("0101");
        funcionario.setEndereço(endereço1);
        funcionario.setSalario(2503.53);

        funcionario.imprime();
        System.out.println("Salario: "+funcionario.getSalario());

    }
}
