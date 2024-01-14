import java.util.Arrays;
import java.util.Scanner;

public class cp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // leaders in an array.. optimized
//         int [] arr = {15,-1,8,2,5,4,2,3};
        // int a = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        // int b = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        // System.out.println(b);
        // int n = arr.length;
        // int l = 1;
        // int max = arr[n-1];
        // for(int i = n-2;i>=0;i--){
        //     if(arr[i]>max){
        //         max = arr[i];
        //         l++;
        //     }
        // }
        // System.out.println(l);

        
        // o(n2) not optimized..
        // int ans = 1;
        // for(int i = 0;i<1;i++){
        //     int maximum = -100000;
        //     for(int j = i+1;j<arr.length;j++){
        //         maximum =Math.max(maximum,arr[j]);
        //     }
        //     System.out.println(maximum);
        //     if(arr[i]>maximum){
        //         ans++;
        //     }
        // }
        // System.out.println(ans);


//        int maximum = -100000;
//             for(int j = 0 ;j<arr.length;j++){
//                 maximum =Math.max(maximum,arr[j]);
//             }
//        System.out.println(maximum);


        // bulb and switches
        int [] arr= {1,1,0,0};
        int ans= 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                continue;
            }else{
                for(int j =i+1;j<arr.length;j++){
                    if(arr[j]==1) {
                        arr[j] = 0;
                        ans++;
                        break;


                    }
                    if(arr[j]==0){
                        arr[j]=1;
                        ans++;
                        break;

                    }

                }
                ans++;
            }
        }

        System.out.println(ans);


        
        
    }

}
