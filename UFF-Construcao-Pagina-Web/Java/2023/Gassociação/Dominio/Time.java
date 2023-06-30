package academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }


    public Time(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        if(jogadores == null){
            return;
        }
        for (Jogador jogador:jogadores
             ) {
            System.out.println(jogador.getNome());
        }
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
