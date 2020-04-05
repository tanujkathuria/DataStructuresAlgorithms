package Recursion;

public class TowerOfHanoi {

    static void toh(int n, char a, char b, char c){
        if(n==1){
            System.out.println("Move disk 1 from "+a+" to "+ c);
            return;
        }
        toh(n-1,a,c,b);
        System.out.println("Move disk "+ n +"from "+a+" to "+ c);
        toh(n-1,b,a,c);
    }

    public static void main(String [] args)
    {

        toh(2,'a','b','c');
        System.out.println("---------------");
        toh(3,'a','b','c');

    }

}
