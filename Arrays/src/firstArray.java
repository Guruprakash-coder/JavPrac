import java.util.*;
public class firstArray {
    public static void main(String[] args) {
        int[] rnos=new int[5];

        Scanner sc=new Scanner(System.in);
        rnos[0]=21;
        for(int i=1;i<5;i++){
            rnos[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(rnos));
    }
}