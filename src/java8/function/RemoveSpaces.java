package java8.function;

import java.util.function.Function;

public class RemoveSpaces {


    public static void main(String[] args) {
        Function<String, String> f = i -> i.replaceAll(" ","" );
        System.out.println(f.apply("tanuj is a big shot"));
    }
}
