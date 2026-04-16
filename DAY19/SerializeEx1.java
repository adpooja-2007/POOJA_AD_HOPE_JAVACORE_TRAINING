import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.OutputStream;
class Student implements Serializable {
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream {
    CustomObjectOutputStream(OutputStream obj) throws IOException {
        super(obj);
    }
    @Override
    protected void writeStreamHeader(){

    }
}
public class SerializeEx1 {
    public static void main(String[] args) throws IOException {
        Student s=new Student("ABC",89);
        File file=new File("Student.txt");
        FileOutputStream fo=new FileOutputStream(file,true);
        //ObjectOutputStream obj=new ObjectOutputStream(fo);
        ObjectOutputStream obj;
        if(file.length()==0){
            obj=new ObjectOutputStream(fo); //first time serializing
        }
        else{
            obj=new CustomObjectOutputStream(fo);   //appending to the existing serialization file
        }
        obj.writeObject(s);//writing on files
        fo.close();
        obj.close();
    }
}