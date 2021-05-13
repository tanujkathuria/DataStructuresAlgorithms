package java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String []args ){
       /* String value = null;
//        Optional value1 = Optional.of(value);
        // will throw null pointer exception
        Optional value2 = Optional.ofNullable(value);
//       System.out.print(value1.isPresent());
        System.out.print(value2.isPresent());*/

        Integer value1 = null;
        Integer value2= new Integer(10);
        Optional<Integer> a= Optional.ofNullable(value1);
        Optional<Integer> b= Optional.of(value2);
        sum(a,b);
    }

    private static void sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println(a.isPresent());
        System.out.println(b.isPresent());
        Integer val1= a.orElse(new Integer(0));
        Integer val2 = b.get();
        System.out.print(val1+val2);
    }
}
