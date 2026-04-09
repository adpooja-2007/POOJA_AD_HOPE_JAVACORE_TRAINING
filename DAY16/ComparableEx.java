import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int mark;
    Student (String name,int mark){
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark-s.mark;
    }
    @Override
    public String toString(){  //to print the object in a readable format
        return name+" "+mark;
    }
}
public class ComparableEx {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student("A", 90));
        s.add(new Student("B", 80));
        s.add(new Student("C", 85));
        Collections.sort(s);
        System.out.println(s);
        for(Student st:s){
            System.out.println(st.name+" "+st.mark);
        }
    }
}