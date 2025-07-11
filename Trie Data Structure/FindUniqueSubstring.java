/*
 Count Unique Substrings

Given a string of length n of lowercase alphabet characters, we need to count the total number of distinct substrings of this string.

str = "ababa"

ans = 10
 */

public class FindUniqueSubstring {
    public static class Node{
        Node children[]= new Node[26];
        boolean eow=false;
        Node()
        {
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
        }
    }
    public static Node root= new Node();
    public static void insert(String word)
    {
        Node curr= root;
        for(int level=0;level<word.length();level++)
        {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]= new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static int CountNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null)
            {
               count+= CountNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String s="apple";
        for(int i=0;i<s.length();i++)
        {
            String Suffix=s.substring(i);
            insert(Suffix);
        }
        System.out.println(CountNodes(root));
    }
}
