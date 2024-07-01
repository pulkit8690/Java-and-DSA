import java.util.*;

public class ReverseString {
    public static String reverse(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        String rev="";
        while(!stack.isEmpty())
        {
            rev=rev+stack.pop();
        }
        return rev;
    }
    public static void main(String[] args) {
         String s="Pulkit Arora";
         System.out.println(reverse(s));
    }
}
