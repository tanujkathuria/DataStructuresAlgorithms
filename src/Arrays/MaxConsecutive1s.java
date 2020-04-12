package Arrays;

public class MaxConsecutive1s {

    public static int findConsecutiveOnes(int []arr, int n){
        int res = 0;
        int curr = 0;
        for(int i =0;i<n;i++){
            if(arr[i] == 0){
                curr = 0;
            }
            else{
                curr++;
                res= Math.max(res,curr);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int res  = findConsecutiveOnes(new int []{1,1,1,1,0,0,1,1,1,1,1,1}, 12);
        System.out.print(res);

    }
}
