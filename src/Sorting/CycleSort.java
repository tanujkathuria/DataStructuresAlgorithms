package Sorting;

import java.util.Arrays;

public class CycleSort {

    public static void swap(int []arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void cycleSort(int[] arr, int n){
        for(int cs=0;cs<n-1;cs++){
            int item = arr[cs];
            int pos = cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i] < item){
                    pos++;
                }
            }
            // If item is already in correct position
            if (pos == cs)
                continue;

            if (pos != cs) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while(pos != cs){
                pos = cs;
                for(int i=cs+1;i<n;i++){
                    if(arr[i] < item){
                        pos++;
                    }
                }
                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }

        }
    }


    public static void main(String[] args) {

        int []arr = {11,15,2,3,5,7,10};
        cycleSort(arr,arr.length);
        System.out.print(Arrays.toString(arr));

    }

}
