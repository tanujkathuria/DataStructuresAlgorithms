package Searching.BinarySearch;

public class BinarySearch {

    public static boolean findUsingBinarySearch(int []arr, int l, int h, int x){

        if(l>h){
            return false;
        }
        int mid = (l+h)/2;
        if(arr[mid] == x){
            return true;
        }
        if(arr[mid] >  x){
            return findUsingBinarySearch(arr,l,mid-1,x);
        }
        else{
            return findUsingBinarySearch(arr,mid+1,h,x);
        }

    }

    public static void main(String[] args) {
        boolean flag = findUsingBinarySearch(new int []{3,5,6,8,10},0,4,4);
        System.out.print(flag);

    }
}
