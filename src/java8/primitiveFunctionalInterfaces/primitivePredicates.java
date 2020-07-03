package java8.primitiveFunctionalInterfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class primitivePredicates {

    public static void main(String[] args) {
        IntPredicate intPredicate = a -> a%2==0;
        LongPredicate longPredicate = a -> a%2==0;
        DoublePredicate doublePredicate = a -> a%2==0;

        //we should use this for the performance since it avoids auto boxing and unboxing
        System.out.println(intPredicate.test(19));
        System.out.println(longPredicate.test(20));
        System.out.println(doublePredicate.test(20.0));
    }
}
