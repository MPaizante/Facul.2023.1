package academy.devdojo.Dojo.Java;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizado = idade >=18;

      if(isAutorizado){
          System.out.println("Autorizado");
      }
        System.out.println("Fora do if!");
    }
}
