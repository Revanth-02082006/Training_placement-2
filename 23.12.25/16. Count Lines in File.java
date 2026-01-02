import java.io.*;

public class CountLines {
    public static void main(String[] args){
        try(BufferedReader br=new BufferedReader(new FileReader("test.txt"))){
            int count=0; while(br.readLine()!=null) count++;
            System.out.println("Lines = "+count);
        }catch(Exception e){ System.out.println(e); }
    }
}
