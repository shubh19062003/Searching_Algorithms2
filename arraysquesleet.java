import java.util.Arrays;

public class arraysquesleet {

    // // // concatenation of arrays q1929.
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 1, 3 };
        // int[] ans = new int[2 * nums.length];
        // int a = 0, b = nums.length;
        // for (int i = 0; i < nums.length; i++) {
        // ans[a] = nums[i];
        // a++;
        // ans[b] = nums[i];
        // b++;

        // }
        // System.out.println(Arrays.toString(ans));

        // // reversing an array.
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] ans = new int[nums.length];
        int b = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums.length - b];
            b++;
        }
        System.out.println(Arrays.toString(ans));

    }

}