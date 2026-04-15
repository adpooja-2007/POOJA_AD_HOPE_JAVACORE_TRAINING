import java.io.FileWriter;
import java.io.IOException;
public class Write{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("test.txt");
            writer.write("helllo..hi");
	    writer.close();
        }catch(IOException e){
            e.getMessage();
        }
    }
}