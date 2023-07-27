import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 1, 22, 31, -4, 5, -6 };
        int[] arr2 = { 5, 99, -54, 65, 25, -56, 15, -22 };
        int c = lsearch(arr);
        System.out.println(arr[0]);
        System.out.println(lsearchRange(arr, 444, 0, 3));
        int min = min(arr2);
        System.out.println(min);

        // strings..
        String str1 = "shubham verma";
        int a = str1.length();
        // System.out.println(a);
        System.out.println("enter the charector to check in the string");
        char tgt = in.next().trim().charAt(0);
        System.out.println(lsearch2(str1, tgt));

        // string -> char -> array.. imp concept %%%%%%%%
        System.out.println(Arrays.toString(str1.toCharArray()));

    }

    static int lsearch(int[] arr) {
        Scanner in = new Scanner(System.in);
        if (arr.length == 0) {
            System.out.println("array is empty");

        }
        System.out.println("enter the desired value to search in the array");
        int a = in.nextInt();

        for (int index = 0; index < arr.length; ++index) {
            if (arr[index] == a) {
                // return index of the elemnt
                System.out.println("the desired value is at the index : " + index);

            }

        }
        return -1;

    }

    // searching in string
    static boolean lsearch2(String str, char target) {
        if (str.length() == 0) { // arr.length is a ref var but str.length() is a func..
            System.out.println("string is empty");
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
                // System.out.println("true");
            }

        }
        return false;
    }

    // linear search in range
    static boolean lsearchRange(int[] arr, int target, int index1, int index2) {
        Scanner in = new Scanner(System.in);
        if (arr.length == 0) {
            System.out.println("array is empty");
        }

        // loop for checking

        for (int i = index1; i <= index2; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // mim value in array..

    static int min(int[] arr) {
        if (arr.length == 0) {
            System.out.println("array is empty");
        }

        // loop for checking min value in array

        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a) {
                a = arr[i];
            }

        }
        return a;

    }

}
