import java.io.File;
import java.io.LineNumberReader;

public class AppThreads {
    public static void main(String[] args) throws Exception {
        LineCounter lineCounter = new LineCounter();
        Thread t = new Thread(lineCounter);
        LineNumberReader lineNumberReade = new LineNumberReader(null);
        
    }
}
