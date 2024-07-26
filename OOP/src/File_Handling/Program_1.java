// Program to read from and write to files

package File_Handling;
import java.io.*;

public class Program_1 {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hello.txt");

            FileWriter fw = new FileWriter("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hi.txt");

            int character;

            while((character = fr.read()) != -1){
                fw.write(character);
            }

            fr.close();
            fw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
