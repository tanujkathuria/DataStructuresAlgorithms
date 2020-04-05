package Recursion;

public class FindSubsetsInAString {


    public static void findSubsetsInAString(String str, String curr, int index){

        if(index == str.length()){
            System.out.println(curr);
            return;
        }
        findSubsetsInAString(str, curr, index+1);
        findSubsetsInAString(str, curr+str.toCharArray()[index], index+1);

    }

    public static void main(String []args){

        findSubsetsInAString("abc","",0);
    }

}
