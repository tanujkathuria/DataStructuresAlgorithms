package Searching.BinarySearch;

public class FindPeakElement {



    public static int findPeakUtil(int[]arr,int low , int high, int n ){
        int mid = (low+high)/2;

        if((mid==0||arr[mid-1]<= arr[mid]) && (mid == n-1 || arr[mid] >= arr[mid+1])){
            return mid;
        }
        else if(mid>0 && arr[mid-1] > arr[mid])
            return findPeakUtil(arr, low, mid-1,n);

        else return findPeakUtil(arr, mid+1, high,n);

    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of a peak point is " +
                findPeakUtil(arr,0, n-1,n));
    }
}
