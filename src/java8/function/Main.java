package java8.function;

import java.util.function.Function;

public class Main {

    static Function<String, Integer> f = i -> {return i.length();};

    static Function<Integer,Integer> f1 = i -> i*i;
    static Function<Integer,Integer> f2 = i -> i+5;

    static Function<String, String> f3 = Function.identity();



    public static void main(String[] args) {
        System.out.println(f.apply("Tanuj"));
        System.out.println(f1.apply(7));
        System.out.println(f1.andThen(f2).apply(5)); // first f1 will be applied then f2
        System.out.println(f1.compose(f2).apply(5)); // first f2 will be applied then f1
        System.out.println(f3.apply("Durga"));
    }
}
