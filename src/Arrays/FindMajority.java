package Arrays;

public class FindMajority {

    public static   int findMajority(int []arr){
        int res =0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[res] == arr[i]){
                count++;
            }
        }
        if(count <= arr.length/2){
            return -1;
        }

        return arr[res];

    }
    public static void main(String[] args) {
        int res  = findMajority(new int[]{6,8,4,8,8});
        System.out.print(res);

    }

}
