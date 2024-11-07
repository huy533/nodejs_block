package searchAlgorithm;

public class BubbleSort {
    public static void bubbleSortAscending(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j =0; j<n-i-1;j++){
                if(arr[j] > arr[j + 1] ){
                  swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[b] = arr[a];
        arr[a]= temp;
    }
    public static void bubbleSortAscending(int[] arr){
        int n =arr.length;
        for(int i=0; i<n-1;i++){
            for(int j = 0; j < n-i-1;j++){
                if(arr[j] < arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
