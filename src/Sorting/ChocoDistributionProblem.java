package Sorting;

import java.util.Arrays;

public class ChocoDistributionProblem {

    public static int  chocolateDistributionProblem(int []arr, int n, int m){
        if(m>n){
            return -1;
        }
        Arrays.sort(arr);
        int res = arr[m-1] - arr[0];
        for(int i=1;i+m-1<n;i++){
            res = Math.min(res,(arr[i+m-1] - arr[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        int []arr= {7,32,2,5,9,12,56};
        System.out.print(chocolateDistributionProblem(arr,arr.length,3));
    }
}
