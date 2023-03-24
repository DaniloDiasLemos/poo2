import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class LineCounter implements Runnable {
    public void run() {

        int totalLines = 0;
        int archiveLines = 0;
        File folder = new File("C:\\Users\\danil\\OneDrive\\Área de Trabalho\\Facul\\POO2\\poo2\\Praticas\\threads\\src\\texts");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {             
                try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file))) {
                    String line = null;
                    while ((line = lineNumberReader.readLine()) != null) {
                        archiveLines += 1;
                    }
        
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            totalLines += archiveLines; 
        }
        
        System.out.println("Total de linhas nos arquivos: " + totalLines);

    }
}
