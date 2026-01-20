package oop5.abstraction;

public class son extends parent{
    public son(int a){
        super(a);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to a "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println(name+" "+age);
    }
}
