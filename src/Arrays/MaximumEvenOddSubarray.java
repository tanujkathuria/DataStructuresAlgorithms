package Arrays;

public class MaximumEvenOddSubarray {

    public static int maxSubArray(int []arr){
        int res = 1;
        int curr= 1;

        for(int i =1;i<arr.length;i++){

            if((arr[i]%2 == 0 && arr[i-1]%2 !=0)||
                    (arr[i]%2 != 0 && arr[i-1]%2 ==0)){
                curr++;
                res = Math.max(res,curr);
            }
            else{
                curr = 1;
            }
        }
        return res;

    }

    public static void main(String []args){
        int res  = maxSubArray(new int []{8,1,6,3,8});
        System.out.print(res);

    }
}
