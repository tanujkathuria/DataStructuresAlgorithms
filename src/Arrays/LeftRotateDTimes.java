package Arrays;

public class LeftRotateDTimes {

    public static int[] rotateLeftOnce(int []arr, int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }

    public static void rotateDTimes(int []arr, int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void reverse(int arr[],int low, int high){
        while(low < high){
            int t = arr[low];
            arr[low] =arr[high];
            arr[high] = t;
            low++;
            high--;
        }
    }

    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }

    public static void main(String [] args){

        int d = 3;
        int arr[] = new int []{2,3,4,5,6};
        printArray(arr);
        for(int i=0;i<d;i++){
            arr = rotateLeftOnce(arr,5);
        }
        printArray(arr);
        System.out.println("second solution---");
        int arr1[] = new int []{2,3,4,5,6};
        rotateDTimes(arr1,arr1.length,d);
        printArray(arr1);


    }
}
