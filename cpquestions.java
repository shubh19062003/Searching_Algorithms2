import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class cpquestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        String s1 = in.next();
        String s = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'h') {
                a++;
                if (a <= 1) {
                    s = s + s1.charAt(i);
                }
            }
            if (s1.charAt(i) == 'e') {
                b++;
                if (b <= 1) {
                    s = s + s1.charAt(i);
                }
            }
            if (s1.charAt(i) == 'l') {
                c++;
                if (c <= 2) {
                    s = s + s1.charAt(i);
                }
            }
            if (s1.charAt(i) == 'o') {
                d++;
                if (d <= 1) {
                    s = s + s1.charAt(i);
                }
            }
        }
        System.out.println(s);
        if (s.charAt(s.length() - 1) == 'o' & s.charAt(s.length() - 2) == 'l' & s.charAt(s.length() - 3) == 'l'
                & s.charAt(s.length() - 4) == 'e' & s.charAt(s.length() - 5) == 'h') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}