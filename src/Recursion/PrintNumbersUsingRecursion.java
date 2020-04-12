package Recursion;

public class PrintNumbersUsingRecursion {

    //to print numbers 1 to n
    public static void printFunc(int n ){
        if(n==0){
            return;
        }
        printFunc(n-1);
        System.out.println(n);
    }

    //to make the above function as tail recursive we need to have an additional parameter
    public static void printFuncTailRecursive(int n, int k){
        if(n==0){
            return;
        }
        System.out.println(k);
        printFuncTailRecursive(n-1,k+1);

    }


        //print n to 1
        public static void printFuncReverseOrder(int n){
            if(n==0){
                return ;
            }
            System.out.println(n);
            printFuncReverseOrder(n-1);
        }

    public static void main(String []args){
        printFunc(5);
        System.out.println("---------------------");
        printFuncReverseOrder(5);
        System.out.println("---------------------");
        printFuncTailRecursive(5,1);
    }

}
