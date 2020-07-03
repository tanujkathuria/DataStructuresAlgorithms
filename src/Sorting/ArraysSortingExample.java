package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortingExample {

    public static void main(String[] args)
    {
        Integer [] arr=  {5,7,20,10};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print(Arrays.toString(arr));
        Arrays.sort(arr,1,3);
        System.out.print(Arrays.toString(arr));


    }
}
