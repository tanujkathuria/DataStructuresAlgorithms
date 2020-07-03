package Sorting;


import java.util.Arrays;

public class KSmallestElement {


    public static void swap(int []arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static int partition(int []arr, int n, int l , int r){

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
    public static int findKSmallestElement(int []arr, int n, int k ){
        int l= 0, r= n-1;
        while(l<=r){
            int p = partition(arr,n,l,r);
            System.out.println(p);
            System.out.println(Arrays.toString(arr));
            if(p == k-1){
                return arr[p];
            }
            else if (p > k-1){
               r = p-1;
            }
            else{
                l=p+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int x= findKSmallestElement(arr,arr.length,4);
        System.out.print(x);


    }
}
