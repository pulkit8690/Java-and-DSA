package Inheritance;

public class Grandparent {
    private int secret=100;
    int age;
    String name;
    Grandparent(){
        this.age=80;
        this.name="Arora";
        this.secret=0;
    }
    Grandparent(int secret,int age, String name)
    {
        this.secret=secret;
        this.age=age;
        this.name=name;
    }
    // Getter for Secret
    public int getSecret(){
        return secret;
    }
    public void msg()
    {
        System.out.println("I am Grandparent");
    }
    public static void main(String args[])
    {
        Grandparent p1= new Grandparent(100,40, "ABC");
        p1.msg();
        System.out.println(p1.name + " " + p1.age + " " + p1.secret);
    }
}
