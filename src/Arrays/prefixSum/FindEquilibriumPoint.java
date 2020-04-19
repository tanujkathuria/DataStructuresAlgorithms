package Arrays.prefixSum;

public class FindEquilibriumPoint {

    public static void findEquilibriumPoint(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int l_sum = 0;
        for(int i=0;i<arr.length;i++){
            if(l_sum == sum - arr[i]){
                System.out.println("equilibrium point reached at position "+(i+1));
            }
            l_sum += arr[i];
            sum -= arr[i];
        }

    }
    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
        findEquilibriumPoint(arr);
    }
}
