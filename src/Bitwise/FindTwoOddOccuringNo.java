package Bitwise;

public class FindTwoOddOccuringNo {

    public static void findTwoOddOccuringNo(int []arr){
        int res1=0, res2=0, XOR=0;
        for(int i=0;i<arr.length ;i++){
            XOR ^= arr[i];
        }
        int sn1 = (XOR & ~(XOR -1));

        for (int i =0;i< arr.length;i++){
            if ((arr[i] & sn1) == 0){
                res1 = res1 ^ arr[i];
            }
            else{
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res1);
        System.out.println(res2);


    }
    public static void main(String args[]){
        int []arr = {1,1,2,3,2,3,5,7};
        findTwoOddOccuringNo(arr);
    }
}
