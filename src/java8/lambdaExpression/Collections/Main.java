package java8.lambdaExpression.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(4);
        al.add(0);
        al.add(20);
        al.add(25);
        //comparator is a functional interface hence one compare method is present

        Collections.sort(al, (i1,i2) -> {
            return i2.compareTo(i1);
        });
        System.out.println(al);

        TreeSet<Integer> ts= new TreeSet<Integer>((i1,i2) -> {
            return i2.compareTo(i1);
        });
        ts.add(4);
        ts.add(0);
        ts.add(20);
        ts.add(25);
        System.out.println(ts);

    }
}

