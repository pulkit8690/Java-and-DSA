/*
 Create a function boolean startsWith(String prefix) for a trie.

Returns true if there is a previously inserted string word that has the prefix, and false otherwise.   

words[] = { "apple", "app", "mango", "man", "woman" }

prefix = "app"                 output: true

prefix = "moon"                output: false
 */

public class StartsWithPrefix {
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
    public static boolean SearchPrefix(String prefix)
    {
        Node curr= root;
        for(int level=0;level<prefix.length();level++)
        {
            int idx= prefix.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }   
    public static void main(String[] args) {
        String words[]={"apple","app","moon","mankind"};
        String prefix1="app";
        String prefix2="key";
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(SearchPrefix(prefix1));
        System.out.println(SearchPrefix(prefix2));
    }
}
