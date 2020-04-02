package Bitwise;

public class CountSetBits {

    public static int countSetbits(int n){
        int res = 0;
        while(n > 0){
            if((n & 1) == 1){
                res++;
            }
            n = n >> 1;
        }
        return res;
    }

    public static int BryanKarninghamAlgo(int n){
        int res = 0;
        while(n > 0){

            n = n & (n-1);
            res++;

        }
        return res;
    }

    //we can also use table lookup method over here
    //here is the link of the same https://ide.geeksforgeeks.org/0fOYHmm55D


    public static void main(String []args){
        int count = countSetbits(5);
        int res = BryanKarninghamAlgo(5);
        System.out.println(count+ " bits are present");
        System.out.println(res+ " bits are present");

    }

}
