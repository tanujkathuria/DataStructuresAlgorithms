package Sorting;

import java.util.Arrays;

public class SortingTwoTypesElements {

    public static void swap(int []arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void sortTwoTypesElements(int []arr, int n){
        int i=-1,j=n;

        while(true) {
            do {
                i++;
            } while (arr[i] < 0);

            do {
                j--;
            } while (arr[j] >= 0);
            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }

    public static void main(String[] args) {

        int []arr = new int []{-2,1,3,4,-5,-2,0};
        sortTwoTypesElements(arr,arr.length);
        System.out.print(Arrays.toString(arr));
    }
}
