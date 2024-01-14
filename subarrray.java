import java.util.Arrays;
import java.util.Scanner;

public class subarrray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // closest max and min..(not optimized)
        // int[] arr = {1,6,4,6,5,1,5,2,6,4,4,2,1};
        // int ans = arr.length;
        // int n = arr.length;
        // int amin = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        // int amax = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        // for(int i = 0;i<n;i++){
        // if(arr[i]==amin){
        // for(int j =i+1;j<n;j++){
        // if(arr[j]==amax){
        // ans=Math.min(ans,i+j-1);
        // break;
        // }
        // }
        // }
        // if(arr[i]==amax){
        // for(int j =i+1;j<n;j++){
        // if(arr[j]==amin){
        // ans=Math.min(ans,i+j-1);
        // break;
        // }
        // }
        // }

        // }
        // System.out.println(ans);
        
        
        // optimized o(n)
        // int[] arr = { 1, 6, 4, 6, 5, 1, 5, 2, 6, 4, 4, 2, 1 };
        // int ans = 13;
        // int n = arr.length;
        // int amin = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        // int amax = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        // int max_i = -1;
        // int min_i = -1;
        // for (int i = n - 1; i >= 0; i--) {
        //     if (arr[i] == amin) {
        //         min_i = i;
        //         if (max_i != -1) {
        //             ans = Math.min(ans, max_i - min_i + 1);
        //         }

        //     }
        //     if (arr[i] == amax) {
        //         max_i = i;
        //         if (min_i != -1) {
        //             ans = Math.min(ans, min_i - max_i + 1);
        //         }

        //     }
        // }
        // System.out.println(ans);


        // sum of subarrays..
//        int[] arr = {1,0,3,4};
//        int ans =0;
//        for(int i =0;i<arr.length;i++){
//            int sum =0;
//            for(int j = i;j<arr.length;j++){
//                sum = sum +arr[j];
//                ans = ans+sum;
//            }
//        }
//        System.out.println("the sum of all subarrays is = "+ ans);

        // contribution method for finding sum
        int[] arr = {1,0,3,4};
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            ans=arr[i]*(arr.length-i)*(i+1)+ans;
        }
        System.out.println(ans);
    }

}
