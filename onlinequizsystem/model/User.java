package onlinequizsystem.model;

public abstract class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.id = id;
        this.name = name;
    }

    public abstract void login();
}