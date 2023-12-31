import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {

        // // // ascending array(sorted)
        int[] arr = { -2, 0, 1, 5, 5, 5, 5, 8, 10, 11, 13, 45, 85 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to get it's index");
        int a = in.nextInt();
        int ans = binarysearch1(arr, a);
        System.out.println("the index of " + a + " is : " + ans);

        // // // descending order(sorted)
        // int[] arr2 = { 100, 85, 70, 63, 55, 42, 36, 20, 18, 10, 5, 0, -1, -9, -20 };
        // System.out.println("enter the num in arr2 to get it's index");
        // int b = in.nextInt();
        // int ans2 = binarysearch2(arr2, b);
        // System.out.println("index of " + b + " is: " + ans2);

        // // // // order agnostic binary search
        // // // sorted array but don't know asc or desc
        // int[] arr3 = { 88, 75, 65, 59, 45, 36, 29, 14, 11, 10, 5, 3, 0, -5, -9, -14
        // };
        // System.out.println("enter the num in arr2 to get it's index");
        // int c = in.nextInt();
        // int ans3 = orderABSearch(arr3, c);
        // System.out.println("index of " + c + " is: " + ans3);

    }

    // func for the algo

    // ascending array (sorted)
    static int binarysearch1(int[] arr, int target) {
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
    static int binarysearch2(int[] arr, int target) {
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

    // // // order Agnostic Binary Search;
    static int orderABSearch(int[] arr, int target) {
        if (arr[0] > arr[arr.length - 1]) {
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

        }
        if (arr[0] < arr[arr.length - 1]) {
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

        }
        return -1;
    }
}