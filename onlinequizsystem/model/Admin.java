package onlinequizsystem.model;

public class Admin extends User {

    public Admin(int id, String name) {
        super(id, name);
    }

    @Override
    public void login() {
        System.out.println(name + " logged in as Admin");
    }
}