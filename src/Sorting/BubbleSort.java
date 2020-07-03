package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String [] args ){
        int []arr= {10,5,1,2,3,7,12,21,56};
         bubbleSort(arr,arr.length);
    }

    public static void swap(int []arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void bubbleSort ( int arr[] , int n ){

        int i,j,temp;
        for (i = 0; i<n ; i++){
            for(j=0;j<n-1-i;j++){

                if(arr[j] > arr[j+1]){
                    //swap the elements
                   swap(arr,j,j+1);
                }
            }
        }
        //print the sorted array
        System.out.println("sorted array: " );
        System.out.print(Arrays.toString(arr));

    }
}
