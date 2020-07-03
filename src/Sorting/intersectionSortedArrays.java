package Sorting;

public class intersectionSortedArrays {

    public static void findIntersectionPoints(int []a, int []b, int m, int n){
        int i =0,j=0;
        while(i<m && j< n){
            if(i>0 && a[i-1] == a[i]){
                i++;
                continue;
            }
            if(a[i] < b[j]) {
                i++;
            }
            else if (b[j] < a[i]) {
                j++;
            }
            else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }


    }
    public static void main(String[] args) {

        findIntersectionPoints(new int []{3,5,10,10,10,15,15,20}, new int []{5,10,10,15,30},8,5);
    }
}
