import java.io.File;

public class AppThreads {
    public static void main(String[] args) throws Exception {
        
        LineCounter lineCounter = new LineCounter();
        Thread t = new Thread(lineCounter);

        File folder = new File("C:\\Users\\danil\\OneDrive\\Área de Trabalho\\Facul\\POO2\\poo2\\Praticas\\threads\\src\\texts");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {           
                t.run();
        }
    }
}
