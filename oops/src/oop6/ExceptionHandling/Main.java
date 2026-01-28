package oop6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a,b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Vanakam mame");
        }


    }
    static int divide(int a, int b)
    {
        if(b==0){
            throw new ArithmeticException("pls do not ddivide by zero");
        }
        return a/b;
    }
}
