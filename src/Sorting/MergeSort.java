package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int []a, int []b, int m, int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(a[i] < b[j]){
                System.out.print(a[i++]+" ");
            }
            else{
                System.out.print(b[j++]+" ");
            }
        }
        while(i<m){
            System.out.print(a[i++]+" ");
        }
        while(j<n){
            System.out.print(b[j++]+" ");
        }
    }

    //[10,21,12,14,15,1,7]

    public static void mergeFunction(int []arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int []a = new int[n1];
        int []b = new int[n2];


        for(int i=0;i<n1;i++){
            a[i] = arr[l+i];
        }

        for(int j=0;j<n2;j++){
            b[j] = arr[m+1+j];
        }
        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }
            else{
                arr[k++] = b[j++];
            }
        }
        while(i<n1){
            arr[k++] = a[i++];
        }
        while(j<n2){
            arr[k++] = b[j++];
        }
    }


    public static void mergeSort(int []arr, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            mergeFunction(arr,l,m,r);
        }
    }

    public static void main(String[] args) {

        int []b = {10,21,12,14,15,1,7};
        mergeSort(b,0,b.length-1);
        System.out.print(Arrays.toString(b));
    }
}
