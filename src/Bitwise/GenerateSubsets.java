package Bitwise;

public class GenerateSubsets {

    public static void generateSubsets(String str){
        int n = str.length();
        double count = Math.pow(2,n);

        for(int i=0;i<count;i++){
            for(int j=0;j<n;j++) {
                if((i & (1<<j)) != 0){
                    System.out.print(str.toCharArray()[j]);
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String []args){
        generateSubsets("abc");
    }
}
