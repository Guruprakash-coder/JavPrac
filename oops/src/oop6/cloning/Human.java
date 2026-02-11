package oop6.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{3,4,5,6,9,1};
    }

//    public Human(Human other){
//        this.age=other.age;
//        this.name=other.name;
//        this.arr=other.arr;
//    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
