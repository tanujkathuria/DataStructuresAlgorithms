package Arrays;

public class ReverseArray {

    public static int[] reverseArray(int []arr){
        int low =0;int high = arr.length-1;
        while (low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
    public static void main(String []args){
        int []arr = reverseArray(new int[]{21,13,14,12,56});
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
