package File_Handling.Random_Access_File;
import java.io.*;

public class random_access_file {
    public static void main(String[] args) {
        int a = 123;
        long b = 45678;
        String s = "Some text";

        try{
            RandomAccessFile r = new RandomAccessFile("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hello.txt", "rw");

            // writing integer value
            r.writeInt(a);

            // writing long value
            r.writeLong(b);

            // writing string value
            r.writeUTF(s);

            // set pointer
            r.seek(0);

            System.out.println(r.read());

            r.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
