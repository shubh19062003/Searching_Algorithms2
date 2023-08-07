import java.lang.annotation.Target;
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

        // int[] nums = { 6, 5, 4, 8 };
        // int[] ans = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        // int count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[i] > nums[j]) {
        // count++;

        // }
        // }
        // ans[i] = count;
        // }
        // System.out.println(Arrays.toString(ans));

        // // // 1389. Create Target Array in the Given Order
        /*
         * Initially target array is empty.
         * From left to right read nums[i] and index[i], insert at index index[i] the
         * value nums[i] in target array.
         * Repeat the previous step until there are no elements to read in nums and
         * index.
         * 
         * 
         * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
         * Output: [0,4,1,3,2]
         * Explanation:
         * nums index target
         * 0 0 [0]
         * 1 1 [0,1]
         * 2 2 [0,1,2]
         * 3 2 [0,1,3,2]
         * 4 1 [0,4,1,3,2]
         */

        // ArrayList<Integer> ans = new ArrayList<>();
        // int[] nums = { 0, 1, 2, 3, 4 };
        // int[] index = { 0, 1, 2, 2, 1 };
        // for (int i = 0; i < nums.length; i++) {
        // ans.add(index[i], nums[i]);
        // // System.out.print(ans);
        // }
        // int target[] = new int[ans.size()];
        // for (int i = 0; i < ans.size(); i++) {
        // target[i] = ans.get(i);
        // }
        // System.out.println(ans);

        // // // 1470. Shuffle the Array
        /*
         * Given the array nums consisting of 2n elements in the form
         * [x1,x2,...,xn,y1,y2,...,yn].
         * 
         * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
         * Input: nums = [2,5,1,3,4,7], n = 3
         * Output: [2,3,5,4,1,7]
         * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
         * [2,3,5,4,1,7].
         */

        // int[] nums = { 2, 5, 1, 3, 4, 7 };
        // int a = 0, b = 1, n = nums.length / 2;
        // int[] ans = new int[nums.length];
        // for (int i = 0; i < n; i++) {
        // ans[a] = nums[i];
        // a = a + 2;
        // }
        // for (int j = n; j < 2 * n; j++) {
        // ans[b] = nums[j];
        // b = b + 2;

        // }
        // System.out.println(Arrays.toString(ans));

        // // // 1512. Number of Good Pairs
        /*
         * Given an array of integers nums, return the number of good pairs.
         * 
         * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
         * 
         * Input: nums = [1,2,3,1,1,3]
         * Output: 4
         * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
         * 
         */

        // int[] nums = { 1, 2, 3, 1, 1, 3 };
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // count++;
        // }
        // }
        // }
        // System.out.println(count);

        // // // 1832. Check if the Sentence Is Pangram
        /*
         * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
         * Output: true
         * Explanation: sentence contains at least one of every letter of the English
         * alphabet.
         */

        // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // System.out.println(sentence.length());
        // for (char i = 'a'; i <= 'z'; i++) { // direct charecter ko hi use krskte h
        // loop me
        // if (sentence.indexOf(i) < 0) {
        // System.out.println("false");
        // ;
        // } else {
        // System.out.println("true");
        // }
        // }
        // System.out.println(sentence.indexOf('b'));

        // diff approach
        // char start = 'a', end = 'z';
        // int s = (int) start;
        // int e = (int) end;
        // for (int i = s; i <= e; i++) {
        // if (sentence.indexOf(i) < 0) {
        // System.out.println("false");
        // } else {
        // System.out.println("true");
        // }
        // }

        // // // 1732. Find the Highest Altitude

        /*
         * There is a biker going on a road trip. The road trip consists of n + 1 points
         * at different altitudes. The biker starts his trip on point 0 with altitude
         * equal 0.
         * 
         * You are given an integer array gain of length n where gain[i] is the net gain
         * in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the
         * highest altitude of a point.
         * Input: gain = [-5,1,5,0,-7]
         * Output: 1
         * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
         */

        // int[] gain = { -5, 1, 5, 0, -7 };
        // int a = 0;
        // int[] ans = new int[gain.length + 1];
        // ans[0] = 0;
        // for (int i = 0; i < gain.length; i++) {
        // int c = a + gain[i];
        // a = c;
        // ans[i + 1] = a;

        // }
        // int c = Arrays.stream(ans).max().getAsInt();
        // System.out.println(c);

        // // // 1773. Count Items Matching a Rule
        /*
         * Input: items =
         * [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold",
         * "iphone"]], ruleKey = "color", ruleValue = "silver"
         * Output: 1
         * Explanation: There is only one item matching the given rule, which is
         * ["computer","silver","lenovo"].
         */

        String[][] items = { { "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };
        String ruleKey = "type", ruleValue = "phone";
        int i = 0, a = 0, count = 0;
        if (ruleKey == "color") {
            a = 1;
        }
        if (ruleKey == "type") {
            a = 0;
        }
        if (ruleKey == "name") {
            a = 2;
        }
        for (i = 0; i < items.length; i++) {
            if (items[i][a] == ruleValue) {
                count++;
            }
        }
        System.out.println(count);
        

    }

}