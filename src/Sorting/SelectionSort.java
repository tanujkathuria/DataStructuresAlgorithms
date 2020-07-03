package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int []arr, int n){
        for(int i=0;i<n;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr= {34,12,3,77,21,1,0};
        selectionSort(arr, arr.length);
        System.out.print(Arrays.toString(arr));
    }

}