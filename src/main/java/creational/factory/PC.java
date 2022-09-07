package main.java.creational.factory;

public class PC extends Computer {
    private String cpu;
    private String ram;
    private String hdd;

    public PC(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }


    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
