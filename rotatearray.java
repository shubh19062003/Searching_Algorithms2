import java.util.*;

public class rotatearray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("enter the value of k to rotate");
        int k = in.nextInt();
        int n = arr.length;
        int[] arr2 = rotate(arr, k, n);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] rotate(int[] array, int k, int n) {
        k = k % n;
        k = n - k;
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
        reverse(array, 0, n - 1);
        return array;
    }

    public static int[] reverse(int[] array, int i, int j) {
        // int i = 0;
        // int j = n - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}
