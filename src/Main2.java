import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("poem.txt");

//            file.write("Hello how are you \nwtf man");    //  this overrides what's in the file
            file.append("\ncode by anuradha");      //  this adds to the end
            file.append("\nNigga");
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
