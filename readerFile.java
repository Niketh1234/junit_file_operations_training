import java.io.*;
public class readerFile{
    public static void main(String args[]) throws IOException{
        File f = new File("C:\\Users\\pulkit\\Desktop\\dummy.txt");
        FileReader fr = new FileReader(f);
        char[] array = new char[(int)f.length()];
        fr.read(array);
        System.out.println(new String(array));
        fr.close();
    }
}