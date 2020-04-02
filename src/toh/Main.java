package toh;

public class Main {

    static void toh(int n, char from_rod, char aux_rod, char to_rod){
        if(n==1){
            System.out.println("Move disk 1 from "+from_rod+" to "+ to_rod);
            return;
        }
        toh(n-1,from_rod,to_rod,aux_rod);
        System.out.println("Move disk "+ n +"from "+from_rod+" to "+ to_rod);
        toh(n-1,aux_rod,to_rod,from_rod);
    }

    public static void main(String [] args)
    {

        int n=4;
        toh(4,'a','b','c');

    }
}
