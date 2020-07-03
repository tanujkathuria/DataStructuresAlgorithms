package java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ArrayList<Movie> al= new ArrayList<>();
        al.add(new Movie("dil","tanuj","deepika"));
        al.add(new Movie("bau","pravas","shrakgda"));
        al.add(new Movie("bali","anishka","anushka"));
        al.add(new Movie("dhadkane","sharma","kareena"));
        al.add(new Movie("do","virat","koena"));

        Consumer<Movie> movieConsumer = m -> {
            System.out.print(m.getName()+" ");
            System.out.print(m.getHero()+" ");
            System.out.print(m.getName()+" ");
            System.out.println();
        };

        for(Movie m : al){
            movieConsumer.accept(m);
        }


        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("dura");
    }
}
