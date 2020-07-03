package java8.lambdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main  {

    static Function<Integer,Integer> f= i -> i*i;
    static Predicate<Integer> p = i -> i%2 == 0;


    public static int squareVal(int val){
        return val*val;
    }

    public static void main(String[] args) {

        IMain iMain = () -> {System.out.println("method implementation");} ;
        iMain.m1();

        Runnable r =() -> System.out.println("ruin method ");
        Thread t= new Thread(r);
        t.start();

        //lambda expression used inside as an anonymous inner class in place of runnable
        Thread t1= new Thread(()  -> {
            for(int i=0;i<10;i++){
                System.out.println("anonymous lambda exp"+i);
            }
        });
        t1.start();


        System.out.println("square of 4 is "+squareVal(4));
        System.out.println("square of 4 is "+f.apply(4));
        System.out.println(" 4 is even no "+p.test(4));
        System.out.println(" 4 is even no "+p.test(5));


    }

}
