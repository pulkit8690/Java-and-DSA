import java.util.Arrays;

public class longest_prefix {
    public static String lp(String strs[])
    {
        String ans="";
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;
        while(index<s1.length())
        {
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
        if(index==0)
        {
            ans="";
        }
        else{
            ans=s1.substring(0, index);
        }
        return ans;
    }
    public static void main(String[] args) {
        String strs[]={"code","coding","coddii"};
        System.out.println(lp(strs));
    }
}
