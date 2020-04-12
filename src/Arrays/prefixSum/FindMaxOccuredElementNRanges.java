package Arrays.prefixSum;

public class FindMaxOccuredElementNRanges {

    static int MAX = 1000000;

    public static int findMaxOccuringElement(int[]l , int[]r, int n){

        int []arr = new int[MAX];
        for(int i=0;i<n ;i++){
            arr[l[i]] += 1;
            arr[r[i]+1] -= 1;
        }

        int mSum = 0;
        int index = 0;

        for(int i=1;i<n;i++){
           arr[i] += arr[i-1];
           if(arr[i] > mSum){
               mSum = arr[i];
               index = i;
           }
        }

        return index;


    }
    public static void main(String[] args) {

        int[] L = { 1, 4, 9, 13, 21 };
        int[] R = { 15, 8, 12, 20, 30 };
        int n = L.length;
        System.out.println(findMaxOccuringElement(L, R, n));
    }
}
