package academy.devdojo.Dojo.Java.Classes.Minterfaces.Dominio;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load(){
        System.out.println("Carregando dados...");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo.");
    }
}
