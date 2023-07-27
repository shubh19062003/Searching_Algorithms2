import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 1, 5, 8, 10, 11, 13, 45, 85, };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to get it's index");
        int a = in.nextInt();
        int ans = binarysearch(arr, a);
        System.out.println("the index of " + a + " is : " + ans);

    }

    // func for the algo
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // not using (s+e)/2 as int has
            if (arr[mid] < target) {
                start = mid + 1;

            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (target == arr[mid]) {
                return mid;
            }

        }
        return -1;
    }

}
