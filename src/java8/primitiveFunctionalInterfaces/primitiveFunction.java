package java8.primitiveFunctionalInterfaces;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class primitiveFunction {

    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println(toIntFunction.applyAsInt("durga "));

        IntFunction intFunction = i -> i*i;
        System.out.println(intFunction.apply(10));
    }
}
