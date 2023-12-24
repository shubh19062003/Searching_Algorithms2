import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long[] arr = new long[(int) (n)];
        long c = 0, d = 0;
        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            } else {
                d = arr[i] - arr[i + 1];
                arr[i + 1] = arr[i];
                c = c + d;
            }

        }
        System.out.println(c);
    }

}
