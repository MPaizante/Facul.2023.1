package academy.devdojo.Dojo.Java;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // numeros vai ser 0
        //char vai ser '\u0000' ou seja ' '
        //String null
        // boolean false
        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Gohan";


        for (int c = 0; c < nomes.length; c = c + 1){
            System.out.println(nomes[c]);
        }



    }
}
