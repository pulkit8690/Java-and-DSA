
public class Object_Class_1 {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.rno); // 0
        System.out.println(std1.name); // null
        System.out.println(std1.marks); // 0.0
    }
}
class Student
{
    int rno;
    String name;
    float marks;
}
/*
    3 Ways to initialize object

 1. By reference variable  (Object_Class_2)
 2. By method              (Object_Class_3)
 3. By constructor

 # How to access instance variables?
 - Instance Variable: Variables of Object
 - To access them use '.' operator
 - Eg. std1.name

 # Dynamic Memory Allocation
 new keyword is used for Dynamic Memory Allocation.
 It assign memory during runtime and add refernce to it

 */