package Inheritance;
public class Parent extends Grandparent{
    int par_var;
    Parent()
    {
        super(200, 50, "DefaultName");  
        this.par_var = 0;
    }
    Parent(int secret,int age, String name, int par_var)
    {
        super(secret, age, name);
        this.par_var=par_var;
    }
    @Override
    public void msg()
    {
        System.out.println("I am Parent");
    }
    public static void main(String args[])
    {
        Parent p1= new Parent();
        p1.msg();
        System.out.println(p1.name + " " + p1.age + " " + p1.getSecret());
        Parent p2= new Parent(200,40,"Pulkit",9);
        System.out.println(p2.name + " " + p2.age + " " + p2.getSecret() + " " + p2.par_var);
    }
}
