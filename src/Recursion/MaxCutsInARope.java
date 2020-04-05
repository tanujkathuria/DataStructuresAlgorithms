package Recursion;


/**
 * Given a range of length n, you need to find out the max no of pieces you can make such that the length of every piece is set
 */
public class MaxCutsInARope {

    public static int maxCuts(int n, int a , int b, int c){

        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res =  Math.max(Math.max(maxCuts( n -a, a , b, c),maxCuts(n -b, a , b, c)),maxCuts(n-c, a , b, c));
        return res + 1;

    }

    public static void main(String []args){
        int maxCuts = maxCuts(5,2,5,1);
        int maxCuts2 = maxCuts(23,12,9,11);
        System.out.println(maxCuts);
        System.out.println(maxCuts2);
    }

}
