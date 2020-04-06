package Bitwise;

public class FindMissingNumber {

    public static int findMissingNumber(int []arr, int n){
        int res=arr[0],res1=1;
        for(int i=1;i<n;i++){
            res = res^arr[i];
        }
        for(int i=2;i<=n+1;i++){
            res1 = res1^i;
        }
        return (res1^res);

    }
    public static void main(String []args){

        int res = findMissingNumber(new int[]{1,2,4,5,6},5);
        System.out.print(res);
    }
}
