package Sorting;

import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int []arr, int n){

        int max = arr[0];
        for(int i=1;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        for(int exp=1;max/exp>0;exp*=10){
            countingSort(arr, n, exp);
        }
    }

    public static void countingSort(int []arr, int n, int exp){
        int []count = new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]= count[i-1]+count[i];
        }
        int []output= new int [n];
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10] -1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int []arr = {319,212,6,8,100,59};
        radixSort(arr,arr.length);
        System.out.print(Arrays.toString(arr));

    }
}
