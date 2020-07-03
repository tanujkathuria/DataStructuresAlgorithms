package java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerChaining {

    public static void main(String[] args) {

        ArrayList<Movie> al= new ArrayList<>();
        al.add(new Movie("dil","tanuj","deepika"));
        al.add(new Movie("bau","pravas","shrakgda"));
        al.add(new Movie("bali","anishka","anushka"));
        al.add(new Movie("dhadkane","sharma","kareena"));
        al.add(new Movie("do","virat","koena"));


        Consumer<Movie> c1= (m) -> {System.out.println("movie name : "+m.getName());};
        Consumer<Movie> c2= (m) -> {System.out.println("movie hero name : "+m.getHero());};
        Consumer<Movie> c3= (m) -> {System.out.println("movie heroin name : "+m.getHeroin());};

        Consumer<Movie> combined = c1.andThen(c2).andThen(c3);
        for(Movie m : al){
            combined.accept(m);
        }
    }
}
