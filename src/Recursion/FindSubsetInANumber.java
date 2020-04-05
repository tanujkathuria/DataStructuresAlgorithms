package Recursion;

import java.awt.*;

public class FindSubsetInANumber {

    public static int findSubsets(int []arr, int index, int sum){
        if(index == 0){
             return (sum == 0) ? 1 : 0;
        }

        return  findSubsets(arr,index-1,sum) + findSubsets(arr,index-1,sum-arr[index-1]);
    }


    public static void main(String []args){
        int subsets  = findSubsets(new int []{10,25,15},3,25);
        System.out.print(subsets);
    }
}
