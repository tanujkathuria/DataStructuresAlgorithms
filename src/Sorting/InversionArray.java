package Sorting;

public class InversionArray {

    public static int inversionArray(int []arr, int l ,int r ){
        int res =0;
        int m = (l+r)/2;

        if(l<r){
            res += inversionArray(arr,l,m);
            res += inversionArray(arr,m+1,r);
            res += countAndMerge(arr,l,m,r);
         }
        return res;
    }

    public static int countAndMerge(int []arr, int l, int m, int r){

        //[10,20,30,1,8,15,5]
        int n1= m-l+1;
        int n2 = r-m;

        int []arr1 = new int [n1];
        int []arr2 = new int [n2];

        for(int i=0;i<n1;i++){
           arr1[i] = arr[i+l];
        }
        for(int j=0;j<n2;j++){
            arr2[j] = arr[j+m+1];
        }
        int i=0,j=0, k= l, res = 0;
        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                arr[k++]= arr1[i++];
            }
            else{
                arr[k++]= arr2[j++];
                res += n1-i;
            }
        }
        while(i<n1){
            arr[k++]= arr1[i++];
        }
        while(j<n2){
            arr[k++]= arr2[j++];
        }
        return res;
    }

    public static void main(String[] args) {

        int res = inversionArray(new int []{2,4,1,3,5},0,4);
        System.out.print(res);
    }
}
