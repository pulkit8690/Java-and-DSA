// Implements Count Words Equal to, Count Word Starting With, Erase Word

public class ImplementationOfTree2 {
    public static class Node{
        Node children[]= new Node[26];
        boolean eow=false;
        int ew; //endwith
        int cp; // count prefix;
        Node()
        {
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
            ew=0;
            cp=0;
        }
    }
    public static Node root= new Node();
    public static void  insert(String word)
    {
        Node curr= root;
        for(int level=0;level<word.length();level++)
        {
            int idx= word.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]= new Node();
            }
            curr.cp++;
            curr=curr.children[idx];
        }
        curr.eow=true;
        curr.ew++;
    }
    public static int CountWordEqualto(String key)
    {
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return 0;
            }
            curr=curr.children[idx];
        }
        return curr.ew;
    }
    public static int  countWordsStartWith(String key)
    {
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return 0;
            }
            curr=curr.children[idx];
        }
        return curr.cp;
    }
    public static void Erase(String key)
    {
        Node curr= root;
        for(int i=0;i<key.length();i++)
        {
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]!=null)
            {
                curr.cp--;
            }
            curr=curr.children[idx];
        }
        curr.ew--;
    }
    public static void main(String[] args) {
        String word[]={"the","a","there","there","any","thee"};
        for(int i=0;i<word.length;i++)
        {
            insert(word[i]);
        }
        System.out.println(countWordsStartWith("th"));
        System.out.println(CountWordEqualto("there"));
        Erase("there");
        System.out.println(CountWordEqualto("there"));
        System.out.println(countWordsStartWith("th"));
    }
}
