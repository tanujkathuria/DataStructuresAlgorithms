package Bitwise;

public class PowerOf2 {

    public static boolean  checkPowerOf2(int n){
        if(n == 0 )
        {
            return false;
        }
        while(n != 1){
            if(n%2 !=0 ){
                return false;
            }
            n =n/2;
        }
         return true;
    }

    public static boolean checkUsingBryaanKarninghamAlgo(int n){

        return (n!=0 && (n & n-1) == 0);
    }
    public static void main(String []args ){
        boolean value = checkPowerOf2(3);
        boolean result = checkUsingBryaanKarninghamAlgo(8);
        System.out.println(value);
        System.out.println(result);
    }
}
