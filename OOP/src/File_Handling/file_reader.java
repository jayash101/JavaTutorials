package File_Handling;
import java.io.*;

public class file_reader {
    public static void main(String[] args) {
        try{
            FileReader file_reader = new FileReader("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hello.txt");

            int character;
            while((character = file_reader.read()) != -1){
                System.out.print((char)character);
            }
            file_reader.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
