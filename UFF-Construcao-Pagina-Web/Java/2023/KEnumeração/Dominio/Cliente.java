package academy.devdojo.Dojo.Java.Classes.KEnumeração.Dominio;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoCliente tipoCliente;
    public static final String Pessoa_Fisica = "Pessoa_Fisica";
    public static final String Pessoa_Juridica = "Pessoa_Juridica";

    public Cliente(String nome, String tipo) {
        if(!tipo.equals(Pessoa_Fisica)  && !tipo.equals(Pessoa_Juridica)){
            return;
        };
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
