package academy.devdojo.Dojo.Java;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagem = "Vou doar";
        String mensagem1 = "Não doar";
        String resultado;

        if(salario > 5000){
            resultado = mensagem;
        }else {
            resultado = mensagem1;
        }
        System.out.println(resultado);

        double x = 2000;
        String n = "AAAAAAA";
        String m = "BBBBBBB";
        String p = x > 1000 ? m : n;//true : false
        System.out.println(p);

    }
}
