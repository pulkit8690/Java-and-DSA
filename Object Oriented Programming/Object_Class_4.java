
public class Object_Class_4 {
    public static void main(String[] args) {
        System.out.println("For Student 1");
        Student std1 = new Student();
        System.out.println(std1.rno); // 1000
        System.out.println(std1.name); // XYZ
        System.out.println(std1.marks); // 1000.0f

        System.out.println("For Student 2");
        Student std2 = new Student();
        System.out.println(std2.rno); // 1000
        System.out.println(std2.name); // XYZ
        System.out.println(std2.marks); // 1000.0f
        
        System.out.println("For Student 3");
        Student std3=new Student();  
        std3.rno=10;
        std3.name="Pulkit";
        std3.marks=75.5f;
        // Printing Properties of std1
        System.out.println(std3.rno); //10
        System.out.println(std3.name); //Pulkit
        System.out.println(std3.marks);// 75.5
    }
}
class Student
{
    // Give Default Values 
    int rno =1000;
    String name="XYZ";
    float marks=1000.0f;
}