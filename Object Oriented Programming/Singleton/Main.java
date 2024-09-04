package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();
        Singleton ob3 = Singleton.getInstance();
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob3.hashCode());
        // All three objects are pointing to just one object;
    }
}
