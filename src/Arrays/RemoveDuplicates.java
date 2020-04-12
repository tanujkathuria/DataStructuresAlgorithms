package Arrays;

public class RemoveDuplicates {

    public static void removeDuplicates(int []arr){
        int res=1;
        arr[res-1] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }

        for(int i=0;i<res;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String []args){
        removeDuplicates(new int[]{3,4,5,6,6,6,7,});

    }
}
