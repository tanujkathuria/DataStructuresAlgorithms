package java8.staticPackage;

public interface IStaticDemo {
    static void m1(){
        System.out.println("hello m1");
    }
}

class Demo implements IStaticDemo{

    public static void main(String[] args) {
        Demo d = new Demo();
        //d.m1(); wrong
        //Demo.m1(); wrong
        IStaticDemo.m1();
    }

}