public class LinearSearch {
public static int linearSearch(int arr[], int k){

    for(int i=0;i<arr.length;i++){
        if(arr[i]==k){
            return i;
        }
    }

    return -1;
}
    public static void main(String[] args){
        int arr[] = {2, 5, 1, 7, 6};
        int k = 1;
        System.out.println(linearSearch(arr, k));
    }
    
}
