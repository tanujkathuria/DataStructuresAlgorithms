package Searching.BinarySearch;

public class FindSqrt {

    public static int findSqrt(int x){
        int ans = 0;
        if(x==0 || x==1){
            return x;
        }
        int start =1, end=x-1;
        while(start <= end){

            int mid = (start+end)/2;
            if(mid *mid == x){
                return mid;
            }
            if(mid * mid < x ){
                start = mid + 1;
                ans = mid;
            }
            else{
                end = mid-1;
            }

        }
        return ans;


    }
    public static void main(String[] args) {

        int x =11;
        System.out.print(findSqrt(x));
    }
}
