package Recursion;

/*
suppose there are n people in the room and we have to kill every kth person
 */
public class JosephProblem {

    public static int josephProblem(int n, int k){

        if(n==1){
            return 0;
        }
        return (josephProblem(n-1,k)+k)%n;
    }
}
