
/*
1.      String s1="Pulkit";
        String s2="Pulkit";
        String s3=new String("Pulkit");
        if(s1==s2)//// return equal because s1 and s2 pointing to same "Pulkit"
        {
            System.out.println("Equal String");
        }
        else
        {
            System.out.println("Not Equal String");
        }
        if(s1==s3)// return not equal because s3 pointing to new "Pulkit"
        {
            System.out.println("Equal String");
        }
        else
        {
            System.out.println("Not Equal String");
        }
2. Not use == in java to compare strings 
3. Hence use equals() function.
    eg s1.equals(s3);
*/

//import java.util.*;
public class CompareStrings
{
    public static void main(String args[])
    {
        String str1="Pulkit";
        String str2= new String("Pulkit");
        if(str1.equals(str2))
        {
             System.out.println("Equal String");
        }
        else
        {
            System.out.println("Not Equal String");
        }
    }
}