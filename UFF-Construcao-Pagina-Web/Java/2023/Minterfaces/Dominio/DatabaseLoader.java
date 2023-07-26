package academy.devdojo.Dojo.Java.Classes.Minterfaces.Dominio;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load(){
        System.out.println("Carregando dados...");
    }

    @Override
    public void remove(){
        System.out.println("Removendo Dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no BD.");
    }
}
