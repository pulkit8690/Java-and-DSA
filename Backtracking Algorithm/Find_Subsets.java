/*
 Time Complexity- O(n*2^n)
 Space Complexity- O(n)
 */

import java.util.*;
public class Find_Subsets {
    public static void subset(String s,String ans,int i)
    {
        // Base
        if(i==s.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            else
            {
            System.out.println(ans);
            }
            return;
        }
        // Recursion
        // Yes Choice
        subset(s, ans+s.charAt(i) ,i+1);
        // No Choice
        subset(s, ans, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s= sc.nextLine();
        sc.close();
        subset(s,"",0);
    }
}
