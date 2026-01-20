package oop4;

public class A {
    int num;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        A obj=new A(34);
        System.out.println(obj.hashCode());
        System.out.println(obj);

    }
}
