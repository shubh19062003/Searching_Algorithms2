import java.util.Scanner;

public class ls_in_2d_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                { 11, 25, 22 },
                { 1, 8 },
                { 15, 16, 19 },
                { 25, 20 }
        };
        System.out.println("enter the desired value to search in the array");
        int a = in.nextInt();
        System.out.println(search2d(arr, a));
    }

    static int search2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    System.out.println("your desired value is at the index row = " + row + " & coloumn = " + col);
                }
            }
        }
        return 0;
    }
}
