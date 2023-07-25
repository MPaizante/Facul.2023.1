package academy.devdojo.Dojo.Java.Classes.Minterfaces.Teste;

import academy.devdojo.Dojo.Java.Classes.Minterfaces.Dominio.DatabaseLoader;
import academy.devdojo.Dojo.Java.Classes.Minterfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader =  new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
