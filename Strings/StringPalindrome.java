// Time Complexity--> O(n)


import java.util.*;
public class StringPalindrome
{
    public static boolean palindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1=sc.nextLine();
        boolean p =palindrome(str1);
        if(p==true)
        {
            System.out.println(str1+" is a Palindrome.");
        }
        else
        {
            System.out.println(str1+" is a not a Palindrome.");
        }

    }
}