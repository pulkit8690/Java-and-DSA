package Singleton;

public class Singleton {
    private Singleton()
    {

    }
    private static Singleton instance;
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance= new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();
        Singleton ob3 = Singleton.getInstance();
        System.out.println(ob1);// Will Print random hashvalue
        System.out.println(ob2);// Will Print random hashvalue
        System.out.println(ob3);// Will Print random hashvalue

        
        // All three objects are pointing to just one object;
    }
}
