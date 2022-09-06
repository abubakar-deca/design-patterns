package main.java.creational.prototype;

public class User {
    private String username;
    private AccessControl accessControl;

    public User(String username, AccessControl accessControl) {
        this.username = username;
        this.accessControl = accessControl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", accessControl=" + accessControl +
                '}';
    }
}
