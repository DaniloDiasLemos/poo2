import java.io.LineNumberReader;
import java.io.File;

public class LineCounter implements Runnable {
    public void run() {
        File file = new File("Praticas\\threads\\src\\texts");
        File afile[] = file.listFiles();
        int i = 0;
        for (int j = afile.length; i < j; i++) {
            File arquivo = afile[i];
            System.out.println(arquivo);
        }
    }
}
