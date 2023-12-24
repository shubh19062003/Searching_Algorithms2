import java.util.Scanner;

public class cp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        System.out.println(countPrimes(a1));
    }

    static int countPrimes(int n) {
        int count = 0;
        if (n == 0 || n == 1 || n == 2) {
            return count;

        }
        if (n == 3) {
            return count + 1;

        }

        if (n <= 4) {
            count = count + 2;
            return count;

        }
        if (n > 4) {
            count = 2;
            for (int i = 4; i < n; i++) {
                boolean a = checkprime(i);
                if (a == true) {
                    count++;
                }
            }

        }
        return count;

    }

    static boolean checkprime(int a) {
        int count = 0;
        for (int j = 1; j <= Math.sqrt(a); j++) {
            if (a % j == 0) {
                count++;

            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

}