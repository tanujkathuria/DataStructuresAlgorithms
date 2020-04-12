package Arrays;

public class WindowSlidingProblem {

    public static int findMaxSumSubarray(int []arr, int k){
        // k must be greater
        if (arr.length < k)
        {
            System.out.println("Invalid");
            return -1;
        }
        int sum = 0;
        int res = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        res =Math.max(res,sum);

        for(int i=k;i<arr.length;i++){
            sum = (sum +arr[i]) - arr[i-k];
            res = Math.max(res,sum);
        }
        return res;
    }

    /**
     * Only works in case of non negative integers s
     * @param arr
     * @param sum
     * @param l
     * @param r
     * @return
     */
    public static boolean findSubArrayWithGivenSum(int []arr, int sum, int l, int r){
        int curr_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            curr_sum+=arr[i];
            while (curr_sum > sum && l < i-1){
                curr_sum -= arr[l];
                l++;
            }
            if(curr_sum == sum){
                return  true;
            }

        }
        return false;
    }


    public static void main(String[] args) {

        int []arr = new int[]{15, 2, 4, 8, 9, 5, 10, 23};
        int res  = findMaxSumSubarray(arr,4);
        System.out.println(res);
        boolean res1 = findSubArrayWithGivenSum(arr,23,0,arr.length);
        System.out.println(res1);

    }

}
