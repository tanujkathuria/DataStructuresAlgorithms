package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {



    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(5);
        al.add(0);
        al.add(20);
        al.add(30);
        al.add(12);

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Tanuj");
        al1.add("kathuria");
        al1.add("dinesh");
        al1.add("kartik");
        al1.add("ms");
        al1.add("dhoni");

        System.out.println(al);
        List<Integer> list  = al.stream().filter(a -> a%2 == 0).sorted().collect(Collectors.toList());

        List<Integer> list1  = al.stream().map(a -> a*2).sorted((a1,a2) -> a2.compareTo(a1)).collect(Collectors.toList());

        long count = al1.stream().filter(s -> s.length() >=5 ).count();

        int min = al.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        int max = al.stream().max((i1,i2) -> i1.compareTo(i2)).get();

        System.out.println(list);
        System.out.println(list1);
        System.out.println(min);
        System.out.println(max);
        System.out.println(count);

        al.stream().forEach((a) -> {
            System.out.print(" "+ a);
        });

        al.stream().forEach(System.out::println);

        Integer []arr = al.stream().toArray(Integer []:: new);
        System.out.println(Arrays.toString(arr));

        Stream<Integer> stream =  Stream.of(9,999,99999,99999);
        stream.forEach(System.out::println);
    }
}
