package searchAlgorithm;

public class InsertionSort {
    public static void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i <n ; i++){
            int temp = arr[i];
            int j = i -1;
        
        while (j>= 0 && arr[i] < temp){
            arr[j + i] = arr[j];
            j = j -1;
        }
        arr[i+ 1] = temp;
    }
}}
