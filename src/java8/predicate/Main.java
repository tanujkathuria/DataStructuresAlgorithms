package java8.predicate;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i>10;
        System.out.println(p1.test(100));

        Predicate<Integer> p2 = i -> i%2 == 0;
        System.out.println(p2.test(100));

        Predicate<String> p3 = i -> i.length() > 5;
        System.out.println(p3.test("kathuria"));

        //negate and or are the 3 default methods in the predicate interface
        System.out.println(p1.negate().test(100));
        System.out.println(p1.and(p2).test(20));
        System.out.println(p1.or(p2).test(23));

        //program to display name starts with k
        Predicate<String> p4 = i -> i.startsWith("k");
        System.out.println(p4.test("kathuria"));


        Predicate<String> p5 = Predicate.isEqual("Tanuj");
        System.out.println(p5.test("durga"));
        System.out.println(p5.test("Tanuj"));

    }
}
