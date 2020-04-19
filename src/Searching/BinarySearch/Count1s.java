package Searching.BinarySearch;

public class Count1s {


    public static int countOnes(int [] arr, int l , int h , int x ){
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == x && (arr[mid-1] != x || mid==0)){
            return arr.length-mid;
        }
        if(arr[mid] >=  x){
            return countOnes(arr,l,mid-1,x);
        }
        else{
            return countOnes(arr,mid+1,h,x);
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 1, 1, 1, 1, 1};
        int n = arr.length;
        int count  = countOnes(arr,0,arr.length-1,1);
        System.out.print(count);



    }
}
