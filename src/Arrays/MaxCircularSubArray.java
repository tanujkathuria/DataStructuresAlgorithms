package Arrays;

public class MaxCircularSubArray {

    public static int maxSubArraySum(int []arr){
        int res = arr[0];
        int max_sum= arr[0];
        for(int i=1;i<arr.length;i++){
            max_sum = Math.max(max_sum+arr[i],arr[i]);
            res = Math.max(max_sum,res);
        }
        return res;
    }

    public static void main(String[] args) {
        int []arr = new int []{8,-4,3,-5,4};
        int res = maxSubArraySum(arr);
        int res1 = 0 ;
        if(res < 0 ){
           System.out.print(res);
        }
        else{
            int sum=0;

            for(int i =0 ; i< arr.length;i++){
                sum+=arr[i];
                arr[i] = -arr[i];
            }
             res1 = maxSubArraySum(arr) + sum;
            int circularSum = Math.max(res,res1);
            System.out.print(circularSum);
        }

    }
}
