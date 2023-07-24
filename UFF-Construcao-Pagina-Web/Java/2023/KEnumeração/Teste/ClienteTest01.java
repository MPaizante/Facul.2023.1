package academy.devdojo.Dojo.Java.Classes.KEnumeração.Teste;

import academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus", "Pessoa_Fisica");
        Cliente cliente2 = new Cliente("Paizante", "Pessoa_Juridica");
        Cliente cliente3 = new Cliente("Araujo", "pessoa juridica");
        Cliente cliente4 = new Cliente("Nero", "pessoa juridica");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
