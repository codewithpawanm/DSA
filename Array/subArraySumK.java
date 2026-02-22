public class subArraySumK {
    public static void printSubarraysWithSumK(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    System.out.print("[ ");
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
                    }
                    System.out.println("]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        printSubarraysWithSumK(arr, k);
    }
}