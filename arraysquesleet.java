import java.util.Arrays;

public class arraysquesleet {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3 };
        int[] ans = new int[2 * nums.length];
        int a = 0, b = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[a] = nums[i];
            a++;
            ans[b] = nums[i];
            b++;

        }
        System.out.println(Arrays.toString(ans));
    }
}