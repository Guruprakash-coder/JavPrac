package oop6.generics;

import java.util.Arrays;

public class customGenericArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public customGenericArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull() {
        return size == data.length;

    }
    public void resize(){
        int[] temp= new int[data.length *2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data=temp;
    }
    public int remove(){

        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;

    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list= new ArrayList();
        //list.add(45);
        customArrayList list=new customArrayList();
        list.add(5);
        list.add(10);
        list.add(7);
        System.out.println(list);

    }
}
