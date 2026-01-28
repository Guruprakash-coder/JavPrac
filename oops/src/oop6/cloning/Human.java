package oop6.cloning;

public class Human implements Cloneable {
    int age;
    String name;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
