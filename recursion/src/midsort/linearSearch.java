package midsort;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,3,4,5};
        //findALlIndex(arr,4,0);
        //System.out.println(list);
        System.out.println(Linearlist(arr,4,0,new ArrayList<>()));
    }
    static int Linear(int[] arr,int target,int i){
        if(arr[i]==target){
            return i;
        }
        if(i==arr.length-1 && arr[i]!=target){
            return -1;
        }
        return Linear(arr,target,i+1);
        //(or) return (arr[i]==target)||Linear(arr,target,i+1) for boolean
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findALlIndex(int[] arr,int target,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
        findALlIndex(arr,target,i+1);
    }
    static ArrayList<Integer> Linearlist(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

        return Linearlist(arr,target,i+1,list);
    }
    static ArrayList<Integer> LinearlistNOLIST(int[] arr,int target,int i){
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

        ArrayList<Integer> ansFromBelow=LinearlistNOLIST(arr,target,i+1) ;
        list.addAll(ansFromBelow);
        return list;

    }
}
