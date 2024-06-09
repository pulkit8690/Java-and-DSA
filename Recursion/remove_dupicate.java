package Recursion;

public class remove_dupicate {
    public static void RemoveDuplicate(String s, int index, StringBuilder sb, boolean map[])
    {
        if(index==s.length())
        {
            System.out.println(sb);
            return;
        }
        char curr_ch = s.charAt(index);
        if(map[curr_ch-'a']==true)
        {
            RemoveDuplicate(s, index+1, sb, map);
        }
        else
        {
            map[curr_ch-'a']=true;
            RemoveDuplicate(s, index+1, sb.append(curr_ch), map);
        }
    }
    
    public static void main(String[] args)
     {
        String s="apppnacoollege";
        RemoveDuplicate(s, 0, new StringBuilder(""), new boolean[26]);

    }
}
