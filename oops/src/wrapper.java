public class wrapper {
    public static void main(String[] args) {
    a obj=new a("fdv");
    for(int i=0;i<10000000;i++){
        obj=new a("default");
    }
    }
}
class a{
    final int a=10;
    String name;
    a(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}