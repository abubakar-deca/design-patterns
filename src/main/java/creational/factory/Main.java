package main.java.creational.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your choice");
        System.out.println(
                "1 ----> For PC \n" +
                "2 ----> For Server");
        int num = scanner.nextInt();
        String type = "";
        switch (num) {
            case 1:
                type = "pc";
                break;
            case 2:
                type = "server";
        }
        System.out.println("Select your preferred RAM size");
        System.out.println("Sizes available are: \n" +
                "1 ----> 2 GB\n" +
                "2 ----> 4 GB\n" +
                "3 ----> 8 GB\n" +
                "4 ----> 16 GB");

        scanner.nextLine();
        num = scanner.nextInt();
        String ram = "";

        switch (num) {
            case 1:
                ram = "2 GB";
                break;
            case 2:
                ram = "4 GB";
                break;
            case 3:
                ram = "8 GB";
                break;
            case 4:
                ram = "16 GB";
        }

        System.out.println("Select your preferred Hard disk size");
        System.out.println("Sizes available are: \n" +
                "1 ----> 128 GB\n" +
                "2 ----> 256 GB\n" +
                "3 ----> 512 GB\n" +
                "4 ----> 1 TB");
        scanner.nextLine();
        num = scanner.nextInt();
        System.out.println("Git testing in ComputerFactory");
        String hdd = "";

        switch (num) {
            case 1:
                hdd = "128 GB";
                break;
            case 2:
                hdd = "256 GB";
                break;
            case 3:
                hdd = "512 GB";
                break;
            case 4:
                hdd = "1 TB";
        }

        System.out.println("Select your preferred CPU");
        System.out.println("Sizes available are: \n" +
                "1 ----> 2.4 GHz\n" +
                "2 ----> 2.9 GHz\n" +
                "3 ----> 3.4 GHz\n" +
                "4 ----> 3.9 GHz");

        scanner.nextLine();
        num = scanner.nextInt();
        String cpu = "";

        switch (num) {
            case 1:
                cpu = "2.4 GHz";
                break;
            case 2:
                cpu = "2.9 GHz";
                break;
            case 3:
                cpu = "3.4 GHz";
                break;
            case 4:
                cpu = "3.9 GHz";
        }
        System.out.println("type: " + type);
        System.out.println("hdd: " + hdd);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        Computer computer = ComputerFactory.getComputer(type, hdd, cpu, ram);
        System.out.println(computer);
    }
}
