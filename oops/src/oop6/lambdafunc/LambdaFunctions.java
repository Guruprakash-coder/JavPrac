package oop6.lambdafunc;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        arr.forEach((item)-> System.out.println(item*2));

        Consumer<Integer> fun=(item) -> System.out.println(item*2);
        arr.forEach(fun);

        Operation sum=(a, b)-> a+b;
        Operation prod=(a, b)-> a*b;
        Operation div=(a, b)-> a/b;

        LambdaFunctions myCalculators =new LambdaFunctions();
        System.out.println(myCalculators.operate(5,3,sum));
        System.out.println(myCalculators.operate(5,3,prod));
        System.out.println(myCalculators.operate(5,3,div));

    }

    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }

}

 interface Operation {
    int operation(int a,int b);
}