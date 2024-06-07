/* 
1. strings are declared with variable 'String'
2. strings are immutable ie we can't make changes in a string , to make changes new string is formed
3. To take string as input use sc.next() or sc.nextLine.
4. sc.next() will take first word and sc.nextLine() will take full sentence.
5. Length of string is calculated using str.length().
6. Concatenation--> str1 + str2
*/

import java.util.*;
public class string1
{
    public static void main(String args[])
    {
        //char arr[] ={'a','b','d','e'};   // char array
        
        // String
       // String str1 ="abcde@12383-";
       // String str2= new String("xyz123");

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str3=sc.nextLine();
        System.out.println("Entered String is "+str3);

        // Length of String
        int length=str3.length();
        System.out.println("The Length of String "+str3+" is "+length);

        // Concatination
        System.out.print("Enter String1: ");
        String str4=sc.nextLine();
        System.out.print("Enter String2: ");
        String str5=sc.nextLine();
        System.out.println("After Concatenation: ");
        String str6= str4+" "+str5;
        System.out.println(str6);
        sc.close();
    }
}