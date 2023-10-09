import java.util.Scanner;

public class cp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int count = 0;
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int[] arr = new int[n1];
            for (int j = 0; j < n1; j++) {
                arr[j] = in.nextInt();
            }
            for (int j = 0; j < n1; j++) {
                if (arr[j] == n2) {
                    count++;

                }

            }
            if (count > 0) {
                System.out.println("YES");

            } else {
                System.out.println("NO");

            }

        }
    }
}