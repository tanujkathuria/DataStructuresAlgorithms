package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(int []arr, int n, int k){
        int max = arr[0];
        for(int i=1;i<n;i++){
            max= Math.max(max, arr[i]);
        }
        max++;

        ArrayList<ArrayList<Integer>>list = new ArrayList();
        for(int i=0;i<k;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            list.get((k*arr[i])/max).add(arr[i]);
        }
        for(int i=0;i<k;i++){
            Collections.sort(list.get(i));
        }
        int index = 0;
        for(int i=0;i<k;i++){
            for(int j=0;j<list.get(i).size();j++){
                arr[index++] = list.get(i).get(j);
            }
        }

    }

    public static void main(String[] args) {
        int []arr = {30,40,10,80,5,12,70};
        bucketSort(arr, arr.length,4);
        System.out.print(Arrays.toString(arr));


    }
}
