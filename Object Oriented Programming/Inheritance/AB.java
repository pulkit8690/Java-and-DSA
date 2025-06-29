package Inheritance;

public class AB implements A,B {
    @Override
    public void method()
    {
        A.super.method();
        B.super.method();
    }
    public static void main(String[] args) {
        AB obj = new AB();
        obj.method();
    }
}
