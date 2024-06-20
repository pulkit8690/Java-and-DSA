
//// initializing object By Method

class Student
{
    int rno;
    String name;
    float marks;
    void insert(int rno,String name, float marks)
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    void displayInfo()
    {
        System.out.println(this.rno+" "+this.name+" "+this.marks);
    }
}
public class Object_Class_3 {
    public static void main(String[] args) {
        Student std1=new Student();
        Student std2=new Student();
        std1.insert(10, "Pulkit", 75.7f);
        std2.insert(11, "Virat", 80.8f);
        std1.displayInfo();
        std2.displayInfo();
    }
}

