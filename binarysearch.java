import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {

        // ascending array(sorted)
        int[] arr = { -2, 0, 1, 5, 8, 10, 11, 13, 45, 85 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to get it's index");
        int a = in.nextInt();
        int ans = binarysearch(arr, a);
        System.out.println("the index of " + a + " is : " + ans);

        int[] arr2 = { 100, 85, 70, 63, 55, 42, 36, 20, 18, 10, 5, 0, -1, -9, -20 };
        System.out.println("enter the num in arr2 to get it's index");
        int b = in.nextInt();
        int ans2 = binaryseach2(arr2, b);
        System.out.println("index of " + b + " is: " + ans2);

    }

    // func for the algo

    // ascending array (sorted)
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

    // descending array(sorted)
    static int binaryseach2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                start = mid + 1;
            }
            if (arr[mid] < target) {
                end = mid - 1;
            }
            if (arr[mid] == target) {
                return mid;
            }

        }
        return -1;

    }

}
