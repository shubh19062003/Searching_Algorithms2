import java.util.Scanner;

public class leetmed {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] arr = {-1,-1};
        while (start <= end) {
            int mid = start - (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                // potnetial ans found
                
            }
        }
        return arr;
    }

    public int[] check(int[] nums, int target,boolean lindex){
        int start = 0;
        int end = nums.length - 1;
        int[] arr = {-1,-1};
        while (start <= end) {
            int mid = start - (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                int ans = mid;
                
            }
        }
        return arr;

    }

}