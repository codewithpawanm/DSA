public class LargestInArray {
    public static int LargestArray(int arr[]){
        // int largest = Integer.MIN_VALUE;
         int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[] = {3,2,4,56,2};
        System.out.println(LargestArray(arr));
    }
    
}
