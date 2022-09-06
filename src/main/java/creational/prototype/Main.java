package main.java.creational.prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        AccessControl admin = AccessControlFactory.getAccessControl("ADMIN");
        AccessControl user1 = AccessControlFactory.getAccessControl("USER");
        AccessControl manager = AccessControlFactory.getAccessControl("MANAGER");

        AccessControl admin2 = AccessControlFactory.getAccessControl("ADMIN");
        User user = new User("A", admin);
        User user2 = new User("B", admin2);

        AccessControl control = user.getAccessControl();
        List<String> accessList = control.getAccess();
        accessList.add("Supervise Resources");
        control.setAccess(accessList);
        user.setAccessControl(control);
        System.out.println(user);
        System.out.println(user2);

    }
}
