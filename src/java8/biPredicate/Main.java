package java8.biPredicate;

import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> (a+b) % 2 == 0;
        System.out.println(biPredicate.test(10,20));
        System.out.println(biPredicate.test(10,15));
    }
}
