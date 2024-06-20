// initializing object By reference variable

public class Object_Class_2 {
    public static void main(String[] args) {
        Student std1=new Student();  //reference variable std1
        std1.rno=10;
        std1.name="Pulkit";
        std1.marks=75.5f;
        // Printing Properties of std1
        System.out.println(std1.rno); 
        System.out.println(std1.name); 
        System.out.println(std1.marks);
    }
}
class Student
{
    int rno;
    String name;
    float marks;
}
