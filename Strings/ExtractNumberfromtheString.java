// https://www.geeksforgeeks.org/problems/extract-the-number-from-the-string3428/1

import java.util.*;

public class ExtractNumberfromtheString

{
    public static long ExtractNumber(String sentence)
    {
        String [] words=sentence.split(" ");
        ArrayList<Integer> num = new ArrayList<>();
        for(String word : words)
        {
            if(word.matches("\\d+"))
            {
                if(!word.contains("9"))
                {
                    num.add(Integer.parseInt(word));
                }
            }
        }
        if(num.isEmpty())
        {
            return -1;
        }
        else{
            return Collections.max(num);
        }
    }
    public static void main(String[] args) {
       String sentence1="This is alpha 5057 and 97";
       String sentence2="Another input 9007";
       System.out.println(ExtractNumber(sentence1));
       System.out.println(ExtractNumber(sentence2));
    }
}