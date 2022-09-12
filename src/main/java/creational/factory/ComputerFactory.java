package main.java.creational.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String hdd, String cpu, String ram) {
        if ("pc".equals(type)) {
            return new PC(cpu, ram, hdd);
        } else if ("server".equals(type)) {
            return new Server(cpu, ram, hdd);
        }

        System.out.println("Git testing in ComputerFactory");
        return null;
    }
}
