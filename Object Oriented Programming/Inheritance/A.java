package Inheritance;

public interface A {
    default void method(){
        System.out.println("From A");
    }
}
