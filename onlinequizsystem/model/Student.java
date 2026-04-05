package onlinequizsystem.model;

public class Student extends User {

    public Student(int id, String name) {
        super(id, name);
    }

    @Override
    public void login() {
        System.out.println(name + " logged in as Student");
    }
}