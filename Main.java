import searchAlgorithm.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.out){
            
            System.out.println("Nhap So luong phan tu cua mang");
            int arrayLength = scanner.nextLine();

            int[] arrayInput = new int[arrayLength];

            System.out.println("Nhap cac phan tu cua mang");
            for(int i = 0; i < arrayLength;i++){
                System.out.println("phan tu thu" + i +":");
                arrayInput[i] = scanner.nextLine();
            }
            System.out.println("Nhap gia tri can tim");
            int key = Scanner.nextInt();
            callMeForLinearSearch(arrayInput, key);
            scanner.close();
        }
        
    }
    static void callMeForLinearSearch(int[] arrayInput,int key){
        System.out.println(BinarySearch.BinarySearch(arrayInput, key));

    }
    static void callMeForLinearSearch(int[] arrayInput,int key ){
        LinearSearch linearSearchInstance = new LinearSearch();
        System.out.println("vi tri phan tu can tim la" + linearSearchInstance);
    }
    static void callMeForLinearSearch(int[] arrayInput){
        SelectionSort SelectionSortInstance = new SelectionSort();
        System.out.println("Mang Truoc Khi Xap Xep la");
        SelectionSortInstance.SelectionSort(arrayInput);
        printArray(arrayInput);
    }
    static void callMeForLinearSearch(int[] arrayInput){
        InsertionSort InsertionSortInstance = new InsertionSort();
        printArray(arrayInput);
        InsertionSortInstance.InsertionSort(arrayInput);
        System.out.println("Mang sau khi sap xep tu be den lon");

        InsertionSortInstance.InsertionSort(arrayInput);
        System.out.println("Mang sau khi sap xep tu lon den be");
        printArray(arrayInput);
    }
          
    
}