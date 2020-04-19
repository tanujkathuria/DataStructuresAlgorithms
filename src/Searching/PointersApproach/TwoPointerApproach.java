package Searching.PointersApproach;

public class TwoPointerApproach {

    public static boolean twoPointerApproach(int []arr, int n, int sum){
        int l =0, h = n-1;
        while(l < h){
            if(arr[l]  + arr[h] == sum){
                return true;
            }
            else if(arr[l]  + arr[h] > sum){
                h--;
            }
            else{
                l++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 11};
        int n = arr.length;
        int sum = 16;
        System.out.println(twoPointerApproach(arr, n, sum));
    }
}
