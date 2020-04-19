package Searching.BinarySearch;

public class CountOccurances {

    public static int findLeftIndex(int []arr, int l, int h, int x ){
        if(l > h){
            return -1;
        }
        int m=(l+h)/2;

        if(arr[m] == x && (arr[m-1]!=x || m == 0)){
            return m;
        }
        if(arr[m] >= x){
            return findLeftIndex(arr,l,m-1,x);
        }
        else{
            return findLeftIndex(arr,m+1,h,x);
        }

    }
    public static int findRightIndex(int []arr, int l, int h, int x ){
        if(l > h){
            return -1;
        }
        int m=(l+h)/2;

        if(arr[m] == x && (arr[m+1]!=x || m == arr.length-1)){
            return m;
        }
        if(arr[m] <= x){
            return findRightIndex(arr,m+1,h,x);
        }
        else{
            return findRightIndex(arr,l,m-1,x);
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 5, 5, 5, 6, 6};
        int n = arr.length;
        int ele = 5;

        int leftOccur = findLeftIndex(arr,0, n-1, ele);
        int rightOccur = findRightIndex(arr,0, n-1, ele);

        System.out.println(rightOccur - leftOccur + 1);
    }
}
