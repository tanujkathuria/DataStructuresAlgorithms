package Bitwise;

public class FindOneOddOccuringNo {

    public static int findOddOccuringNo(int [] arr){
        int res =0 ;
        for(int i=0; i<arr.length ;i++){
            res ^= arr[i];
        }
        return res;
    }
    public static void main(String []args){

        int []arr = {1,1,2,3,2,3,5};
        int result = findOddOccuringNo(arr);
        System.out.println(result);

    }
}
