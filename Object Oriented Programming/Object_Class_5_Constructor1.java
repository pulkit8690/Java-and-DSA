//Calling constructor from another constructor

public class Object_Class_5_Constructor1 {
    public static void main(String[] args) {
        Student random=new Student();
        System.out.println(random.rno+" "+random.name+" "+random.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student()
    {
        // this is how u call constructor from another constructor
        // internally : new Student(13,"Default Person",100.0f)
        this(13,"Default Person",100.0f);
    }
    Student(int rno,String name,float marks)
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}

