package com.demo;

import java.util.*;
import java.lang.*;
import java.io.*;

class SmallestElement
{
    public static void main (String[] args)
    {

        int testCases = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        String arr[] = args[2].split(" ");;
        int size = n;
        int [] elements = new int [size];
        for(int i=0; i<size; i++) {
            elements[i] = Integer.parseInt(arr[i]);
        }

        int k = Integer.parseInt(args[3]);


        int l=0, r=n-1;
        int i = l-1;
        while(l <= r) {
            int p = partition(elements,l,r);
            if(p == k-1){
                System.out.println(p);
                return;
            }
            else if (p < k-1) {
                l = p+1;
                partition(elements, l, r);
            }
            else {
                r = p - 1;
                partition(elements, l, r);
            }
        }
    }


    public static int partition(int [] elements,int l,int r){
        int pivot = elements[l];
        for(int j=1;j <= r;j++){
            if(elements[j] < pivot){
                int temp = elements[l];
                elements[l] = elements[j];
                elements[j] = temp;
                l++;
            }
        }
        elements[l+1]= pivot;
        System.out.print(elements);
        System.out.print(l);
        return l;
    }


}
