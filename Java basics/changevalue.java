import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class changevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,4,32,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]=99;
    }
}
