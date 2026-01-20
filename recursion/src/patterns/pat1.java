package patterns;

public class pat1 {
    public static void main(String[] args) {
        patterm(4,0);
    }

    static void patterm(int x,int y){
        if(x==0){
            return;
        }
        if(y==x-1){
            System.out.println("*");
            patterm(x-1,0);
        }
        if(y<x-1){
            System.out.print("*");
            patterm(x,y+1);
        }
    }
}
