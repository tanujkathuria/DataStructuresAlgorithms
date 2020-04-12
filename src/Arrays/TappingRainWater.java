package Arrays;

public class TappingRainWater {

    public static int getWater(int []arr, int n)
    {
        int[] lmax = new int[n];
        lmax[0] = arr[0];
        for(int i=1;i<n;i++){
            lmax[i] = Math.max(arr[i],lmax[i-1]);
            System.out.print(lmax[i]+" ");
        }
        System.out.println();

        int[] rmax = new int[n];
        rmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
            System.out.print(rmax[i]+" ");
        }

        int res=0;
        for(int i=1;i<n-1;i++){
            res += Math.min(lmax[i],rmax[i]) - arr[i];
        }
        return res;
    }
    public static void main(String []args){
        int res = getWater(new int []{5,0,6,2,3},5);
        System.out.println();
        System.out.println(res);

    }
}
