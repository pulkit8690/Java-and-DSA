//import java.util.*;
public class PrintString
{
    public static void print(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String args[])
    {
        String str1="Pulkit Arora";
        System.out.println(str1.charAt(0));
        print(str1);
    }
}