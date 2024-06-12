import java.util.*;
public class Permutations {
    public static void Find_Permutation(String s, String ans)
    {
        // Base Case
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        // Recursion
        for(int i=0;i<s.length();i++)
        {
            char curr_ch=s.charAt(i);
            String NewStr= s.substring(0, i)+s.substring(i+1);
            Find_Permutation(NewStr,ans+curr_ch);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s= sc.nextLine();
        sc.close();
        Find_Permutation(s,"");
    }
}
