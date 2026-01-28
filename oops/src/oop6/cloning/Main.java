package oop6.cloning;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human gp=new Human("guruprakash",19);
        Human gp2=gp;
        //Human twin=new Human(gp);
        Human twin=(Human) gp.clone();
        System.out.println(twin.age +" " + twin.name);

    }
}
