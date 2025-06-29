package Inheritance;

public interface B {
    default void method()
    {
        System.out.println("From B");
    }
}
