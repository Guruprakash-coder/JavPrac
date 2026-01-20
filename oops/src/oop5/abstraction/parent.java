package oop5.abstraction;

public abstract class parent {
    int a=9;
    public parent(int a){
        this.a=a;
    }
    static void hello(){
        System.out.println("Hello world");
    }
    abstract void career(String name);
    abstract void partner(String name,int age);
}
