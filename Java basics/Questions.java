import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int [] values=armstrong();
        System.out.println(Arrays.toString(values));
    }

    static int[] armstrong() {
        int[] arr = new int[10];
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            int a = i;
            int sum = 0;


            while (a > 0) {
                int rem = a % 10;
                a = a / 10;
                sum += rem * rem * rem;

            }
            if (sum == i) {

                arr[count] = i;
                count++;
            }

        }
        return arr;
    }
}

