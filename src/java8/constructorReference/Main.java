package java8.constructorReference;

public class Main {

    Main(){
        System.out.println("this is the constructor ");
    }

    public static void main(String[] args) {
        inter i = Main::new;// constructor reference has been used here to return the Main class object
        i.get();
    }
}

interface inter{
    public Main get();
}
