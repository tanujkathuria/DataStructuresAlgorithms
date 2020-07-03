package Sorting;

public class UnionSortedArrays {

    public static void printUnion(int[]a, int []b, int m, int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(i > 0  && a[i] == a[i-1]) {
                i++;
                continue;
            }
            if(j>0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i] < b[j]){
                System.out.print(a[i++] + " ");
            }
            else if(a[i] > b[j]){
                System.out.print(b[j++] + " ");
            }
            else{
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        while(i<m){
            if(i==0 || a[i-1] != a[i]){
                System.out.print(a[i++] + " ");
            }
            else i++;
        }

        while(j<n){
            if(j==0 || b[j-1] != b[j]){
                System.out.print(b[j++] + " ");
            }
            else j++;
        }

    }

    public static void main(String[] args) {
        int []a= {3,8,8};
        int []b={2,8,8,10,15};
        printUnion(a,b,a.length,b.length);
    }
}
