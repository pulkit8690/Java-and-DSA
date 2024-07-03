
import java.util.*;
public class DuplicateParenthesis { //O(n)
    public static boolean parenthesis(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==')')
            {
                int count=0;
                while(s.pop()!='(')
                {
                    count++;
                }
                if(count<1)
                {
                    return  true;
                }
            }
            else
            {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="(a+b)";
        String s2="(a+b)+((a-b))";
        System.out.println(parenthesis(s1));
        System.out.println(parenthesis(s2));
    }
}
