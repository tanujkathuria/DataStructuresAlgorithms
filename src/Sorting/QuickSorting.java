package Sorting;

import java.util.Arrays;

public class QuickSorting {

    public static void swap(int[] arr,int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static int lomutoPartition(int []arr,int l,int r){
      int p = arr[r];
      int i=l-1;
      for(int j=l;j<=r-1;j++){
          if(arr[j] <= p){
              ++i;
              swap(arr,i,j);
          }
      }
      swap(arr,i+1,r);
      return i+1;
    }

    public static void quickSort(int []arr, int l , int h){
        if(l<h){
            int p = lomutoPartition(arr,l,h);
            System.out.print(p);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }

    public static void main(String[] args) {

        int []arr= {2,5,1,10,6,8};
        System.out.print(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
