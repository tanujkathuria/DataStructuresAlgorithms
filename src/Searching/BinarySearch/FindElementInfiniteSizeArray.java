package Searching.BinarySearch;

public class FindElementInfiniteSizeArray {

    public static int findElement(int []arr, int x ){
        if(arr[0] == x){
            return 0;
        }
        int i=1;
        while(arr[i] < x && i < arr.length-1){
                i *= 2;
        }

        return findUsingBinarySearch(arr,i/2,i,x);
    }

    public static int findUsingBinarySearch(int []arr, int l, int h, int x){

        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == x){
            return mid;
        }
        if(arr[mid] >  x){
            return findUsingBinarySearch(arr,l,mid-1,x);
        }
        else{
            return findUsingBinarySearch(arr,mid+1,h,x);
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int element =findElement(arr,10);
        System.out.print(element);
    }
}
