package com.demo.bubbleSort;

public class BubbleSort {

    public static void main(String [] args ){

    }

    public static void insertionSort (int arr[] , int n ) {
        int i,j,temp;
        for(i=1;i<n ;i++){
            j=i;
            while(j>0 && arr[j-1] > arr[j]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void bubbleSort ( int arr[] , int n ){

        int i,j,temp;
        for (i = 0; i<n ; i++){
            for(j=0;j<n-1-i;j++){

                if(arr[j] > arr[j+1]){
                    //swap the elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //print the sorted array
        System.out.println("sorted array: " );
        for(i=0;i<n ;i++){
            System.out.println(arr[i]);
        }

    }
}
