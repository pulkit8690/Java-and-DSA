public class Object_Class_5_Constructor {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.greeting();
        System.out.println(std1.rno); // 13
        System.out.println(std1.name); // ABC
        System.out.println(std1.marks); // 0.0
        std1.changeName("Pulkit");
        std1.greeting();
        System.out.println();
        Student std2 = new Student(21,"Rahul",86.7f);
        std2.greeting();
        System.out.println(std2.rno+" "+std2.name+" "+std2.marks);

        System.out.println();
        Student random=new Student(std1);
        System.out.println(random.rno+" "+random.name+" "+random.marks);

    }
}
class Student
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
    Student() // default Constructor
    {
        this.rno=13;
        this.name="ABC";
        this.marks=0.0f;
    }
    Student(int rno,String name,float marks) // Parameterized Constructor
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student(Student other)
    {
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
}