package com.demo;

public class LexicographicCase {

    public static void main(String []args ){

        //find the rank of STRING in lexicographical order

        int rank = findLexiRank("STRING");
        System.out.print("rank is "+" "+ rank);

    }

    public static int findLexiRank(String str){
        int rank =1;
        int n = str.length();
        int fac= fact(n);

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(str.charAt(i) > str.charAt(j)){
                    count++;
                }
            }
            System.out.println("count"+count);
            fac= fac/(n-i);
            System.out.println("fact"+fac);
            rank += count*fac;

            System.out.println("rank"+rank);
        }

        return rank;
    }

    public static int fact(int n ){
       return n<=2 ? n : n*fact(n-1);
    }
}
