package academy.devdojo.Dojo.Java.Classes.KEnumeração.Teste;

import academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio.Cliente;
import academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Paizante",  TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Araujo", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Nero",  TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
