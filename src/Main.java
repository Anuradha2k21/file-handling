import java.io.File;

public class Main {
    public static void main(String[] args) {
        //  if it's "/", a single "/" would be enough, but if it's "\" it needs to be "\\"
        //  if the file is in project folder it only needs the file name
        File file=new File("C:\\Users\\anura\\OneDrive/Desktop/message.txt");      //  create an object with a file name parameter

        if(file.exists()){
            System.out.println("File exists");
        } else {
            System.out.println("that file does not exist");
        }
    }
}
