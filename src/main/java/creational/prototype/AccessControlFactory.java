package main.java.creational.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessControlFactory {
    static Map<String, AccessControl> map;

    static {
        map = new HashMap<>();
        map.put("ADMIN", new AccessControl("ADMIN", new ArrayList<String>() {{
            add("Modify Resources");
        }}));
        map.put("USER", new AccessControl("ADMIN", new ArrayList<String>() {{
            add("Read Resources");
        }}));

        map.put("MANAGER", new AccessControl("MANAGER", new ArrayList<String>() {{
            add("Supervise Resources");
        }}));
    }

    public static AccessControl getAccessControl(String accessLevel) throws CloneNotSupportedException {
        AccessControl control = null;

        if (map.get(accessLevel) != null) {
            control = map.get(accessLevel).clone();
            List<String> list = new ArrayList<>(control.getAccess());
            control.setAccess(list);
            return control;
        }

        return null;
    }
}
