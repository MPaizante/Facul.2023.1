package academy.devdojo.Dojo.Java.Classes.KEnumeração.Teste;

import academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio.Cliente;
import academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio.TipoCliente;
import academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Paizante",  TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Araujo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Nero",  TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
    }
}
