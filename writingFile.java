import java.io.*;
public class writingFile{
    public static void main(String args[]) throws IOException{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\pulkit\\Desktop\\dummy.txt",true);
        fos.write("\nThis is some data to be in the file".getBytes());
        System.out.println("File writtern successfully");
        fos.close();
    }
}