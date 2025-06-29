package Inheritance;

public class Child extends Parent {
    int child_var;

    Child() {
        super(300, 20, "Default_Child_Name", 0);
        this.child_var = 0;
    }

    Child(int secret, int age, String name, int child_var) {
        super(secret, age, name, 0); 
        this.child_var = child_var;
    }

    @Override
    public void msg() {
        System.out.println("I am Child");
    }

    public static void main(String args[]) {
        Child c1 = new Child();
        c1.msg(); 
        System.out.println(c1.age + " " + c1.getSecret() + " " + c1.name + " " + c1.child_var);
    }
}
