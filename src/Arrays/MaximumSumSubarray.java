package Arrays;

public class MaximumSumSubarray {

    public static int maxSubArraySum(int []arr){
        int res = arr[0];
        int max_sum= arr[0];
        for(int i=1;i<arr.length;i++){
            max_sum = Math.max(max_sum+arr[i],arr[i]);
            res = Math.max(max_sum,res);
        }
        return res;
    }

    public static void main(String []args){

        int res  = maxSubArraySum(new int[]{-3,8,-2,4,-5,6});
        System.out.print(res);
    }
}
