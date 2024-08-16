import java.io.*;
public class writerFile{
    public static void main(String args[]) throws IOException{
        File f = new File("C:\\Users\\pulkit\\Desktop\\actalent.txt");
        FileWriter fw = new FileWriter(f,true);
        fw.write("This is some data in the actalent.txt file".toCharArray());
        fw.close();
    }
}