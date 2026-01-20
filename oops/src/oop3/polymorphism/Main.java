package oop3.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape=new shapes();
        shapes c1=new circle();

        triangle t1=new triangle();

        c1.area();
        System.out.println(c1);


    }
}
