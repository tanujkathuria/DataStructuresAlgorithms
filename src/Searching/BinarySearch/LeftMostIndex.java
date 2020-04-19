package Searching.BinarySearch;


//find the left most index of an element in a sorted array
public class LeftMostIndex {

    public static  int getLeftMostIndex(int[]arr,int x, int l, int h) {
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == x && (arr[mid-1]!=x || mid == 0))
        {
            return mid;
        }
        if(arr[mid] >= x){
           return  getLeftMostIndex(arr,x,l,mid-1);
        }
        else{
           return  getLeftMostIndex(arr,x,mid+1,x);
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 3, 3, 3, 3};
        int n = arr.length;
        int ele = 3;
        int leftMostIndex  = getLeftMostIndex(arr,ele,0,n-1);
        System.out.print(leftMostIndex);
    }
}

