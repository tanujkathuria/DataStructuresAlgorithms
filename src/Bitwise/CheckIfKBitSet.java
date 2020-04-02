package Bitwise;

public class CheckIfKBitSet {

    public static void checkKthBit(int n, int k){

        if((n & (1 << k-1)) == 0){
            System.out.println("it is not set");
        }
        else{
            System.out.println("it is set");
        }
    }


    public static void checkUsingRightShift(int n, int k){
        if(((n >> k-1) & 1) == 0){
            System.out.println("it is not set");
        }
        else{
            System.out.println("it is set");
        }

    }
    public static void main(String[]args){

        checkKthBit(5,3);
        checkUsingRightShift(5,3);
    }
}
