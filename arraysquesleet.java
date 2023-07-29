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

        // reversing an array.
        // int[] nums = { 1, 2, 3, 4, 5 };
        // int[] ans = new int[nums.length];
        // int b = 1;
        // for (int i = 0; i < nums.length; i++) {
        // ans[i] = nums[nums.length - b];
        // b++;
        // }
        // System.out.println(Arrays.toString(ans));

        // // // 1480. Running Sum of 1d Array
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] sum = new int[arr.length];
        // int a = 0, b = 0;
        // for (int i = 0; i < arr.length; i++) {
        // a = arr[i];
        // b = b + a;
        // sum[i] = b;
        // }
        // System.out.println(Arrays.toString(sum));

        // // //1. Two Sum
        // Input: nums = [3,2,4],
        // target = 6,
        // Output: [1,2]
        int[] nums = { 3, 3 };
        int target = 6;

        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            int b = nums[i];
            for (int j = a; j < nums.length; j++) {
                if (b + nums[j] == target) {
                    System.out.println(i + "," + j);

                }
            }
            a++;
        }

        // // // different approach
        // Iterate through the array with two pointers i and j
        int[] sum = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] is equal to the target
                if (nums[i] + nums[j] == target) {
                    // If yes, store the indices in the result array and return
                    sum[0] = i;
                    sum[1] = j;
                }
            }

        }
        System.out.println(Arrays.toString(sum));
    }
}