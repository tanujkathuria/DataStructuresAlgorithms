package Recursion;

public class CheckIfPalindrome {

    public static boolean checkIfPalindrome(String str, int s, int e){
        if(s == e){
            return true;
        }
        if(s>e){
            return true;
        }
        char[]arr = str.toCharArray();
        if(arr[s] != arr[e]){
            return false;
        }
         return checkIfPalindrome(str,++s,--e);

    }

    public static void main(String []args){
        String str="tanuj";
        String str1="aabaa";
        boolean res = checkIfPalindrome(str,0,str.length()-1);
        boolean res1 = checkIfPalindrome(str1,0,str1.length()-1);
        System.out.println(res);
        System.out.println(res1);

    }

}
