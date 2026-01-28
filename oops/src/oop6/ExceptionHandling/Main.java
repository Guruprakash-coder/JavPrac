package oop6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        try {
            System.out.println(divide(a,0));
            throw new Exception("just for fun");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        }finally {
            System.out.println("Vanakam mame");
        }


    }
     public static int divide(int a, int b) throws Exception
    {
        if(b==0){
            throw new Exception("pls do not ddivide by zero");
        }
        return a/b;
    }
}
