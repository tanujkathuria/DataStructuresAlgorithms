package Sorting;

import java.util.Arrays;

public class SortingThreeTypesElements {

    public static void swap(int []arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void sortThreeTypesElements(int []arr, int n){
        int l =0,m=0, h=n-1;
        while (m <= h){
            switch (arr[m]) {
                case 0:
                    swap(arr, l, m);
                    l++;
                    m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(arr, m, h);
                    h--;
                    break;

                default:
            }
        }
    }

    public static void main(String[] args) {
        int [] arr= {2,2,1,1,1,1,0,2,0,0,0,1,1,1};
        sortThreeTypesElements(arr,arr.length);
        System.out.print(Arrays.toString(arr));

    }
}
