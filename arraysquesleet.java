import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        // int[] nums = { 3, 3 };
        // int target = 6;

        // int a = 0;
        // for (int i = 0; i < nums.length; i++) {
        // int b = nums[i];
        // for (int j = a; j < nums.length; j++) {
        // if (b + nums[j] == target) {
        // System.out.println(i + "," + j);

        // }
        // }
        // a++;
        // }

        // // // different approach
        // Iterate through the array with two pointers i and j
        // int[] sum = new int[2];
        // for (int i = 0; i < nums.length - 1; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // // Check if the sum of nums[i] and nums[j] is equal to the target
        // if (nums[i] + nums[j] == target) {
        // // If yes, store the indices in the result array and return
        // sum[0] = i;
        // sum[1] = j;
        // }
        // }

        // }
        // System.out.println(Arrays.toString(sum));

        // // // 1431. Kids With the Greatest Number of Candies
        /*
         * Input: candies = [2,3,5,1,3], extraCandies = 3
         * Output: [true,true,true,false,true]
         * Explanation: If you give all extraCandies to:
         * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the
         * kids.
         * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the
         * kids.
         * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the
         * kids.
         * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among
         * the kids.
         * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the
         * kids.
         */

        // int[] candies = { 2, 3, 5, 1, 3 };
        // int extraCandies = 3;
        // ArrayList<Boolean> list = new ArrayList<Boolean>(candies.length);
        // int max = Arrays.stream(candies).max().getAsInt();
        // for (int i = 0; i < candies.length; i++) {
        // if (candies[i] + extraCandies >= max) {
        // list.add(true);
        // } else {
        // list.add(false);
        // }

        // }
        // System.out.println(list);

        // // // 1365. How Many Numbers Are Smaller Than the Current Number
        /*
         * Input: nums = [8,1,2,2,3]
         * Output: [4,0,1,1,3]
         * Explanation:
         * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
         * For nums[1]=1 does not exist any smaller number than it.
         * For nums[2]=2 there exist one smaller number than it (1).
         * For nums[3]=2 there exist one smaller number than it (1).
         * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
         */

        int[] nums = { 6, 5, 4, 8 };
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;

                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }

}