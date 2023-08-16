public class binaryques {
    public static void main(String[] args) {
        int[] arr = { -10, 2, 3, 5, 9, 14, 16, 18, 22, 28, 33 };
        int a = cieling(arr, 10);
        System.out.println(a);
        int tgt = 7, start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > tgt) {
                end = mid - 1;
                mid = start + (end - start) / 2;
            }
            if (arr[mid] < tgt) {
                start = mid + 1;
                mid = start + (end - start) / 2;
            }
            if (arr[mid] == tgt) {
                System.out.println(tgt);
                break;
            }
            if (arr[mid] > tgt) {
                System.out.println(arr[mid]);

            }
            if (arr[mid] < tgt) {
                System.out.println(arr[mid - 1]);

            }
        }
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
}