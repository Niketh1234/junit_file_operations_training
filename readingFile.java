import java.io.*;
public class readingFile{
    public static void main(String args[]) throws IOException{
        File f = new File("C:\\Users\\pulkit\\Desktop\\dummy.txt");
        if(f.exists()){
            FileInputStream fis = new FileInputStream(f);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            System.out.println("The file is successfully read and content : \n");
            System.out.println(new String(b));
            fis.close();
        }
        else{
            System.out.println("Seems like the file is not present");
        }
    }
}