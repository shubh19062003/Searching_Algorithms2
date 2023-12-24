import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class leetques {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // leetcode ques 1 from kk vid

        // int[] num = { 12, 345, 26, 6, 1245, 455, 42, 451, 126, 5536 };
        // int count1 = 0, d = 0;
        // for (int i = 0; i < num.length; i++) {
        // int a = num[i];
        // int b, c, count = 0;
        // while (a > 0) {
        // b = a % 10;
        // a = a / 10;
        // if (b > 0) {
        // count++;
        // }
        // }
        // if (count % 2 == 0) {
        // count1++;

        // }

        // }

        // System.out.println(count1);

        // short logic for counting digtits
        // int a = 1523;
        // int b = (int) (Math.log10(a) + 1); // shrtct for counting digits.. fastest
        // method
        // System.out.println(b);

        // another logic for counting digits
        // int to string n string ka length..

        // int c = 1245;
        // String str = Integer.toString(a);
        // String str2 = "1245";
        // System.out.println(str.length());
        // System.out.println(str2.length());

        // ques 2: (max wealth problem)
        // int[][] acc = { { 1, 2 }, { 2, 2 }, { 4, 2 }, { 5, 4 }, { 8, 5 } };
        // ArrayList<Integer> sum = new ArrayList<>(4);

        // // int c = 0;
        // for (int i = 0; i < acc.length; i++) {
        // int a = 0, b = 0;
        // for (int j = 0; j < acc[i].length; j++) {

        // a = acc[i][j];
        // b = b + a;
        // // c = b;

        // }

        // sum.add(b);
        // }

        // System.out.println(Collections.max(sum));

        double a = in.nextInt();
        if (a == 1 || a == 0) {
            System.out.println("0");
            System.exit(0);
        }
        if(a<4){
            System.out.println("2 3");
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("not a prime");

            } else {
                System.out.println("prime");
                break;

            }
        }

    }

}
