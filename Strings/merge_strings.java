public  class merge_strings {
    public static String mergeAlternately(String word1, String word2)
    {
        StringBuilder ans= new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        int minLen=Math.min(len1, len2);
        for(int i=0;i< minLen;i++)
        {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        if(len1>len2)
        {
            ans.append(word1.substring(minLen));
        }
        if(len2>len1)
        {
            ans.append(word2.substring(minLen));
        }
        return ans.toString();

    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        System.out.println(mergeAlternately(s1,s2));
    }
}