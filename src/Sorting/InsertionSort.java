package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int []arr, int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j] > key ){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int []arr =  {11,2,5,21,1};
        System.out.print(Arrays.toString(arr));
        insertionSort(arr,arr.length);
        System.out.print(Arrays.toString(arr));

    }

}
