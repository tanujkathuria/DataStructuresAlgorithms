package com.demo.subarray;

import java.util.*;
import java.lang.*;

class PrintSubArray
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for(int j=0;j<n ;j++)
            {
                m[j]= sc.nextInt();
            }
            findSubArray(n, s, m);
        }
    }

    public static void findSubArray(int n, int s, int[] m){
        int first = 0 ;
        int last = 0;
        long result = m[first];
        while(result != s) {

            if(result < s){
                last++;
                if(last >= n){
                    break;
                }
                result += m[last];
            }
            else{
                if(result > s){
                    result -= m[first];
                    first++;

                }
            }
        }
        if(result == s){
            System.out.println("sum of elements from "+(first+1)+"nd position to "+(last+1)+"th position is "+s);
        }
        else{
             System.out.println(-1);
        }
    }

}
