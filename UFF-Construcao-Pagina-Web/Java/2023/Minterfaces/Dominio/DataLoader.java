package academy.devdojo.Dojo.Java.Classes.Minterfaces.Dominio;

public interface DataLoader {

    public abstract void load();
    public default  void checkPermission(){
        System.out.println("Fazendo checagem de permissões ");
    }



}
