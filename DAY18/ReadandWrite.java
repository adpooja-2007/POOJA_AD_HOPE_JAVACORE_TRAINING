import java.io.FileReader;
import java.io.IOException;
public class ReadandWrite{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("test.txt");
            int c;
            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }
        }catch(IOException e){
            e.getMessage();
        }
    }
}