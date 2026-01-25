package oop6.generics;

import java.util.Arrays;
import java.util.List;

public class wildcard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public wildcard() {
        this.data = new Object[DEFAULT_SIZE];
    }
    //Wild card
    public void getList(List<? extends Number> list){

    }// wild card
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull() {
        return size == data.length;

    }
    public void resize(){
        Object[] temp= new Object[data.length *2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data=temp;
    }
    public T remove(){

        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T) data[index];
    }
    public int size(){
        return size;

    }
    public void set(int index,T value){
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

        wildcard<Integer> list=new wildcard<>();
        list.add(5);
        list.add(10);
        list.add(7);
        System.out.println(list);

    }
}
