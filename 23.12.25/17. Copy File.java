import java.io.*;

public class CopyFile {
    public static void main(String[] args){
        try(FileInputStream in=new FileInputStream("input.txt");
            FileOutputStream out=new FileOutputStream("output.txt")){
            int c; while((c=in.read())!=-1) out.write(c);
            System.out.println("File copied.");
        }catch(Exception e){ System.out.println(e); }
    }
}
