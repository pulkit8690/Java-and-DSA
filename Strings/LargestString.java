/*
 1. Largest String is find by Lexicographic ordering ie abb > aab
 2. use compareTo() function or compareToIgnoreCase() function
 3. s1.compareTo(s2) = 0 ---> both string equal
                     > 0 ---> s1>s2
                     < 0 ---> s1<s2
 4. compareToIgnoreCase() treats 'A' and 'a' as same;
 5. TimeComplexity
    suppose there are N strings with x length
    O(x*N)
 */



public class LargestString {
    public static void main(String[] args) {
        String Fruits[]={"apple","mango","banana"};
        String largest=Fruits[0];
        for(int i=1;i<Fruits.length;i++)
        {
            if(largest.compareTo(Fruits[i])<=0)
            {
                largest=Fruits[i];
            }
        }
        System.out.println("Largest String is "+largest);
    }
}
