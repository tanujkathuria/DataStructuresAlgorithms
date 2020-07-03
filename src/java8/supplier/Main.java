package java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<Date> s = () -> {return new Date(); };
        System.out.println(s.get());

    }
}
