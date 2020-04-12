package Arrays;

public class LeadersInAnArray {

    public static void findLeadersInArray(int []arr){
        int n=arr.length;
        int curr_leader = arr[n-1];
        System.out.print(curr_leader+" ");
        for(int i=n-2;i>0;i--){
            if(arr[i] > curr_leader){
                curr_leader=arr[i];
                System.out.print(curr_leader + " ");
            }
        }

    }
    public static void main(String []args){
        findLeadersInArray(new int[]{2,3,13,12,6});

    }
}
