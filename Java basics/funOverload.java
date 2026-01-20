public class funOverload {
    public static void main(String[] args) {
    fun(90);
    fun("guruprakash");
    sumofN(2,4,4,5,6,4,3,5);
    }
    static void fun(int a){
        System.out.println(a+"age");
    }
    static void fun(String name){
        System.out.println("hi"+name);
    }
    static void sumofN(int ...v){
        int sum=0;
        for(int i=0;i<v.length;i++){
            sum+=v[i];
        }
        System.out.println("sum is "+sum);
    }
}
