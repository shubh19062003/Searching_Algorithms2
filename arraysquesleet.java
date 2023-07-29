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
    // int[] nums = { 1, 2, 3, 4, 5 };
    // int[] ans = new int[nums.length];
    // int b = 1;
    // for (int i = 0; i < nums.length; i++) {
    // ans[i] = nums[nums.length - b];
    // b++;
    // }
    // System.out.println(Arrays.toString(ans));

    // // // 1480. Running Sum of 1d Array
    public int[] returningsum(int[] arr, int target) {
        int[] sum = new int[arr.length];
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            b = b + a;
            sum[i] = b;
        }
        return sum;
    }

}