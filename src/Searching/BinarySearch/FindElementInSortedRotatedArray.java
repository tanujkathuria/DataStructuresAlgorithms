package Searching.BinarySearch;

public class FindElementInSortedRotatedArray {

    public static int findElementSortedRotatedArray(int []arr, int n, int key){

        int pivot = findPivot(arr,0, arr.length-1);
        if(pivot == -1){
            return findUsingBinarySearch(arr,0,arr.length-1,key);
        }

        if(arr[pivot] == key){
            return pivot;
        }
        if(arr[0] <= key){
            return findUsingBinarySearch(arr,0,pivot-1,key);
        }

        return findUsingBinarySearch(arr,pivot+1,n-1,key);
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

    public static int findPivot(int []arr,int low, int high){

            if(low > high){
                return -1;
            }
            if(low == high){
                return low;
            }

            int mid = (low+high)/2;

            if(mid < high && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > low && arr[mid] < arr[mid-1]){
                return (mid-1);
            }

            if(arr[low] >= arr[mid]){
                return findPivot(arr,low,mid-1);
            }
            return findPivot(arr,mid+1,high);



    }
    public static void main(String[] args) {
        int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr1.length;
        int key = 3;
        int element =  findElementSortedRotatedArray(arr1,n,key);
        System.out.print(element);

    }
}
