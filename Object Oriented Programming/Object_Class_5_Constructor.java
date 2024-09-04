public class Object_Class_5_Constructor {
    public static void main(String[] args) {
        Student5 std1 = new Student5();
        std1.greeting();
        System.out.println(std1.rno); // 13
        System.out.println(std1.name); // ABC
        System.out.println(std1.marks); // 0.0
        std1.changeName("Pulkit");
        std1.greeting();
        System.out.println();
        Student5 std2 = new Student5(21,"Rahul",86.7f);
        std2.greeting();
        System.out.println(std2.rno+" "+std2.name+" "+std2.marks);

        System.out.println();
        Student5 random=new Student5 (std1);
        System.out.println(random.rno+" "+random.name+" "+random.marks);

    }
}
class Student5
{
    int rno;
    String name;
    float marks;
    void greeting()
    {
        System.out.println("Hello My name is "+name);
    }
    void changeName(String newName)
    {
        System.out.println("My Name Change to "+newName);
        name=newName;
    }
    Student5() // default Constructor
    {
        this.rno=13;
        this.name="ABC";
        this.marks=0.0f;
    }
    Student5(int rno,String name,float marks) // Parameterized Constructor
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student5(Student5 other)
    {
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
}


// this keyword basically tells to which object we are refering