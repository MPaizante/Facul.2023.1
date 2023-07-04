package academy.devdojo.Dojo.Java.Classes.Gassociação.Dominio;

public class Seminario {
    private String Titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        Titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        Titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        Titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
