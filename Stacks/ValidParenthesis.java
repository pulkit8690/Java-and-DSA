import java.util.*;
//O(n)
public class ValidParenthesis {
    public static boolean isValidParenthesis(String s)
    {
        Stack<Character> t= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(ch=='(' ||ch=='{' ||ch=='[')
            {
                t.push(ch);
            }
            else
            {
                if(t.isEmpty())
                {
                    return false;
                }
                if((t.peek()=='(' && ch==')') ||(t.peek()=='[' && ch==']') ||(t.peek()=='{' && ch=='}'))
                {
                    t.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(t.isEmpty())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="({[]})";
        String s2="[{)]";
        String s3="[()]{}";
        System.out.println(isValidParenthesis(s1));
        System.out.println(isValidParenthesis(s2));
        System.out.println(isValidParenthesis(s3));;
    }
}
