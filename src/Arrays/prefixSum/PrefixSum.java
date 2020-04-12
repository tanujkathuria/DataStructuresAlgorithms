package Arrays.prefixSum;

public class PrefixSum {

    public static void getSum(int l, int r, int []arr){
        int []prefix_sum = new int[arr.length];
        prefix_sum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }

        if(l > 0){
            System.out.println(prefix_sum[r] - prefix_sum[l-1]);
        }
        if(l == 0){
            System.out.println(prefix_sum[r]);
        }
    }

    public static void main(String[] args) {
        int l = 2; int r = 5;
        int []arr = new int[]{2,3,5,6,7,9};
        getSum(l,r,arr);
        l=0;
        getSum(l,r,arr);


    }
}
