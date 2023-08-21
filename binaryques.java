public class binaryques {
    public static void main(String[] args) {
        int[] arr = { -10, 2, 3, 5, 9, 14, 16, 18, 22, 28, 33 };
        // int a = cieling(arr, 4);
        // System.out.println(a);
        // int b = floor(arr, 4);
        // System.out.println(b);
        char letters[] = { 'e', 'g', 'k', 'p', };
        char ans = nextGreatestLetter(letters, 'l');
        System.out.println(ans);
        // System.out.println(arr1[0]);
        // if(arr1[0]<arr1[2]){
        // System.out.println("true");
        // }else{
        // System.out.println("false");
        // }
        // int start = 0, end = arr1.length - 1;
        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // if(arr1[arr1.length-1]<target){
        // System.out.println("exteremity achieved");
        // break;
        // }
        // if (arr1[mid] > target) {
        // end = mid - 1;
        // }
        // if (arr1[mid] < target) {
        // start = mid + 1;
        // }
        // if(arr1[mid]<=target){
        // System.out.println(arr1[mid+1]);
        // break;
        // }
        // }

        // int tgt = 7, start = 0, end = arr.length - 1;
        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // if (arr[mid] > tgt) {
        // end = mid - 1;
        // mid = start + (end - start) / 2;
        // }
        // if (arr[mid] < tgt) {
        // start = mid + 1;
        // mid = start + (end - start) / 2;
        // }
        // if (arr[mid] == tgt) {
        // System.out.println(tgt);
        // break;
        // }
        // if (arr[mid] > tgt) {
        // System.out.println(arr[mid]);

        // }
        // if (arr[mid] < tgt) {
        // System.out.println(arr[mid - 1]);

        // }
        // }
    }

    static int cieling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] == target) {
                return arr[mid];
            }
        }
        return arr[start];

    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] == target) {
                return arr[mid];

            }
        }
        return arr[end];

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if (letters[letters.length - 1] <= target) {
            //     return letters[0];
            // }
            if (letters[mid] > target) {
                end = mid - 1;
            }
            else  {
                start = mid + 1;
            }
            // if (letters[mid] <= target) {
            //     return letters[mid + 1];
            // }
        }
        return letters[start%letters.length];
    }

}