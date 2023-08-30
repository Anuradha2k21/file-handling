import java.io.File;

public class Main {
    public static void main(String[] args) {
        //  if it's "/", a single "/" would be enough, but if it's "\" it needs to be "\\"
        //  if the file is in project folder it only needs the file name
        File file=new File("message.txt");      //  create an object with a file name parameter

        if(file.exists()){
            System.out.println("File exists");

            System.out.println(file.getPath());     //  this displays whatever in the constructor
            System.out.println(file.getAbsoluteFile());     //  displays the real path of the file in the computer
            System.out.println(file.isFile());      //  verify a file is a file (whether it's a file or a directory)

//            file.delete();  //  deletes the file
        } else {
            System.out.println("that file does not exist");
        }
    }
}
