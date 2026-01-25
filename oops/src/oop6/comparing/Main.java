package oop6.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student gurup=new Student(37,89.77f);
        Student rahul=new Student(5,99.77f);
        Student gopal=new Student(7,72.77f);
        Student mani=new Student(28,95.77f);
        Student jeeva=new Student(43,89.77f);

        Student[] list={gurup,rahul,gopal,mani,jeeva};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
        if(gurup.compareTo(rahul) < 0){

            System.out.println("Rahul has more marks");
        }
    }
}
