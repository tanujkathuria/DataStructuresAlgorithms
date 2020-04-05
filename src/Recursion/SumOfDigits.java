package Recursion;

public class SumOfDigits {


    public static  int  sumDigits(int n){
        if(n<10){
            return n;
        }
        return n%10 + sumDigits(n/10);

    }

    public static void main(String []args){
        System.out.println(sumDigits(555));
        System.out.println(sumDigits(275));

    }
}
