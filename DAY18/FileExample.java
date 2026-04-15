import java.io.File;
import java.io.IOException;
public class FileExample{
    public static void main(String[] args) throws IOException{
	try{
        File newfile = new File("test.txt");
        if(newfile.createNewFile()){
            System.out.println("File created"+newfile.getName());
        }
        else{
            System.out.println("Not able to create file");
        }
	}catch(IOException e){
		System.out.println(e.getMessage());
	}
    }
}