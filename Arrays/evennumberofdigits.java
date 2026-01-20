public class evennumberofdigits {
    public static void main(String[] args) {
        int[] arr = {21, 54, 78, 843, 10};
        System.out.println(findnumber(arr));
    }

    static int findnumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length;i++){
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int digits = 0;

        while (num !=0) {
            digits += 1;
            num = num / 10;
        }
        if (digits % 2 == 0) {
            return true;
        }
        return false;
    }
}
