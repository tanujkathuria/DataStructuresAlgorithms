package Arrays;

public class LeftRotateArray {

    public static int[] leftRotateArray(int []arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    public static void main(String []args){
        int []arr= leftRotateArray(new int[]{1,2,3,4,5});
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
