package main.java.creational.prototype;

import java.util.List;

public class AccessControl implements Prototype {
    private final String accessLevel;
    private List<String> access;

    public AccessControl(String accessLevel, List<String> access) {
        this.accessLevel = accessLevel;
        this.access = access;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public List<String> getAccess() {
        return access;
    }

    public void setAccess(List<String> access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "accessLevel='" + accessLevel + '\'' +
                ", access=" + access +
                '}';
    }

    @Override
    public AccessControl clone() throws CloneNotSupportedException {
        return (AccessControl) super.clone();
    }
}
