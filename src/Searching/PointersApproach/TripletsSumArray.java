package Searching.PointersApproach;

public class TripletsSumArray {
    public  static boolean findIfTripletGivenSumArray(int []arr, int n, int sum){
        for(int i=0;i<n;i++){
           if(twoPointerApproach(arr,n,sum-arr[i])) {
            return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int n = A.length;
        System.out.print(findIfTripletGivenSumArray(A,n,sum));
    }

    public static boolean twoPointerApproach(int []arr, int n, int sum){
        int l =0, h = n-1;
        while(l < h){
            if((arr[l]  + arr[h]) == sum){
                return true;
            }
            else if((arr[l]  + arr[h]) > sum){
                h--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}
