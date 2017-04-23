import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

class SystemManager {
    private static String initString;
    static {
        String currentString = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("initconfig.txt"));
            while ((currentString = reader.readLine()) != null) {
                initString = currentString;
            }
        }
        catch (IOException ex) {
            throw new NoSuchElementException("File initconfig.txt");
        }
    }
    public SystemManager() {
        if (initString.length() == 0) {
            throw new IllegalArgumentException("length is zero");
        }
        System.out.println("It works!");
    }
} 