package Sorting;

import java.util.Arrays;

public class CountingSort {

    public static void countSort(int []arr, int n, int k){
        int []count = new int [k];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<k;i++){
            count[i] = count[i-1]+count[i];
        }
        int []output = new int[n];
        for(int i =n-1;i>0;i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for (int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int []arr= {1,3,4,4,2,3,2};
        countSort(arr, arr.length, 5);
        System.out.print(Arrays.toString(arr));




    }
}
