package main.java.creational.prototype;

public interface Prototype extends Cloneable{

    AccessControl clone() throws CloneNotSupportedException;
}
