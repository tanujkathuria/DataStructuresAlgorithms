package java8.methodReference;

import java.nio.charset.MalformedInputException;

interface interf {
    public void m1();
}

public class Main
{
    public static void m2(){
        System.out.println("method reference implementation");
    }

    public void m3(){
        System.out.println("instance method m3 reference implementation");
    }

    public static void main(String[] args) {
        interf i1 = Main::m2;
        Main m = new Main();
        interf i2 = m::m3;
        i1.m1();
        i2.m1();
    }
}
