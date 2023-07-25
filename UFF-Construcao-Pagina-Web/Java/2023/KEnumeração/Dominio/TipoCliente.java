package academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");
    private  int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){


        return null;
}

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }





    }
