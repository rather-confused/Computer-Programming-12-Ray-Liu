import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InterruptedIOException;
import java.io.FileNotFoundException;

public class ByteStream {
    public static void main(String[] args) {
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null); {
            System.out.println("Just read " + line);
        }
    }
}
