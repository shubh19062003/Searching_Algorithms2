import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Step 1: Create the outer List (List<List<String>>)
        // List<List<String>> arrayList2D = new ArrayList<>();

        // Step 2: Create the inner Lists (List<String>) and add them to the outer List
        // List<String> row1 = new ArrayList<>();
        // row1.add("phone");
        // row1.add("blue");
        // row1.add("pixel");
        // row1.add("65000");

        // List<String> row2 = new ArrayList<>();
        // row2.add("computer");
        // row2.add("silver");
        // row2.add("lenovo");

        // List<String> row3 = new ArrayList<>();
        // row3.add("phone");
        // row3.add("gold");
        // row3.add("iphone");

        // arrayList2D.add(row1);
        // arrayList2D.add(row2);
        // arrayList2D.add(row3);

        // System.out.println(arrayList2D.size());

        // // System.out.println(arrayList2D.get(0).get(1));
        // // System.out.println(arrayList2D.get(1).get(1));
        // // System.out.println(arrayList2D.get(2).get(1));
        // System.out.println((arrayList2D));

        // String str = "zcinit";
        // System.out.println(str.indexOf('b'));
        // System.out.println(str.charAt(str.length()-1));
        // System.out.println(str.length());
        // ArrayList<Character> list = new ArrayList<>();
        // for(int i = 0;i<str.length();i++){
        // list.add(str.charAt(i));
        // };
        // System.out.println(list);
        // char[] arr = str.toCharArray();
        // System.out.println(Arrays.toString(arr));
        // int count = 1,j=0;
        // for (int i = 1; i < str.length(); i++) {
        // for ( j = 0; j < i; j++) {
        // char a = str.charAt(i);
        // char b = str.charAt(j);
        // if (a == b) {
        // break;

        // }
        // }
        // if (i == j) {
        // count++;
        // }
        // }
        // if(count%2==0){
        // System.out.println("CHAT WITH HER");
        // }
        // else{
        // System.out.println("IGNORE HIM!");
        // }

        // System.out.println();

        // int b = 0;
        // System.out.println("enter two num to find their ceil");
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();
        // boolean a = (n1 % n2 != 0);
        // if (a == true) {
        // b = 1;
        // } else {
        // b = 0;
        // }
        // int c = n1 / n2 + b;
        // // System.out.println(c);
        // int d = Math.ceilDiv(n1, n2);
        // System.out.println(d*2);

        // if (c == d) {
        // // System.out.println(true);
        // // System.out.println(d);
        // } else {
        // // System.out.println(false);
        // }

        String s = "hello";
        String s1 = "";
        String s2 = s+s1;
        System.out.println(s2);
        // StringBuilder s2 = new StringBuilder();
        // for (int i = 0; i < s1.length(); i++) {
        // if (s1.charAt(i) == 'h' || s1.charAt(i) == 'e' || s1.charAt(i) == 'o') {
        // s2.append(s1.charAt(i));

        // }
        // if (s1.charAt(i) == 'l') {
        // a++;
        // if (a <= 2) {
        // s2.append(s1.charAt(i));

        // }else{
        // continue;
        // }

        // }
        // if (s2.length() > 1 & s1.charAt(i) != 'l') {
        // if (s2.charAt(i - 1) == s1.charAt(i)) {
        // s2 = s2.deleteCharAt(i);

        // }

        // }
        // String s = s2.toString();
        // System.out.println(s);
        // }

    }
}
