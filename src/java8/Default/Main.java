package java8.Default;

/**
 * we cannot override object class methods inside the interfaces
 */
public class Main implements inter, inter2 {


    @Override
    public void m1() {
//       inter.super.m1();
        inter2.super.m1();
    }

    public static void main(String[] args) {
        Main m = new Main();
        inter.main(null);
        m.m1();
    }
}

interface inter{

    public static void main(String []args){
        System.out.print("hello main");
    }
    default void m1(){
        System.out.println("default method inter 1 ");
    }
}

interface inter2{

    default void m1(){
        System.out.println("default method inter 2 ");
    }
}