// Final Keyword
/*
 1. Its value can't be change for primitive datatypes.
    eg: final int a=6;
                a=8; // error


    Note : its value has to be assign while declaring;

 2. For Non Primitive Datatype we can change its value but cannot reassigns it.
    eg: final Student s1= new Student()
            s1.name="pulkit";          // can be done
        s1 =new Student("new name");  // Can't be done
 */
public class Object_Class_6_FinalKeyword {
    public static void main(String[] args) {

        // For primitive Data types
        final int a=9;
        //a=5; //error
        System.out.println(a);

        // For non primitive Data types
        final Student s1= new Student("Pulkit");
        s1.name="ABC";// this can be change
        
        //s1=new Student("Geet"); // Error

    }
}
class Student
{
    //final int a; //// Value Need to assign otherwise ERROR

    String name;

    Student(String name)
    {
        this.name=name;
    }
}
