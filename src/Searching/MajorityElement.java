package Searching;

public class MajorityElement {

    public static int findPotentialCandidate(int []arr){
        int res = 0, count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[res]){
                count++;
            }
            else{
                count--;
            }
            if(count ==0) {
                res =i;
                count =1;
            }
        }
        return res;
    }

    public static int findMajorityElement(int []arr){
        int res  = findPotentialCandidate(arr);
        int count =1;
        for(int i=0;i<arr.length;i++){
            if(arr[res] == arr[i]){
                count++;
            }
        }
        if(count > arr.length/2){
            return arr[res];
        }
        else{
            return -1;
        }
    }


    public static void main(String[] args) {

        int res = findMajorityElement(new int []{6,8,4,8,8});
        System.out.print(res);

    }

}
