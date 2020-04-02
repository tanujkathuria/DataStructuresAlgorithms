package com.demo.triplet;

import java.util.Scanner;

public class FindTriplet {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            findTriplet(n, m);
        }
    }

    public static void findTriplet(int n, int [] m) {


    }
}
