package oop7.collections;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();

        list2.add(43);

        list2.add(89);
        System.out.println(list2);
        List<Integer> vect=new Vector<>();
        vect.add(45);
        vect.add(91);
        System.out.println(vect);

    }


}
