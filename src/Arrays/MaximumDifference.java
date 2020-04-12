package Arrays;

public class MaximumDifference {

    public static void getMaxDifference(int []arr){
        int n =arr.length;
        int maxDifference = arr[1] -arr[0];
        int minValue = arr[0];
        for(int i=1;i<n;i++){
            maxDifference = Math.max(maxDifference,arr[i] - minValue);
            minValue = Math.min(minValue,arr[i]);
        }

        System.out.print(maxDifference);
    }

    public static void main(String []args){
        getMaxDifference(new int []{10,12,23,50});
    }
}
