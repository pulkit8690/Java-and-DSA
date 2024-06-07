/*
 1. StringBuilder is better than String is terms of time complexity
        as we can modify StringBuilder but we can't modify Strings due to to which new strings are formed each time.
 2. In String if we want to append it takes O(n^2)
 3. We can convert StringBuilder to string using toString function
        StringBuilder sb ="Hi";
        sb.toString();
 4. for, int a=10
            a.toString() // Error
        Integer a=10
            a.toString() // "10"
 5. for, char ch='a'
            ch.toString() // Error
        Character ch='a'
            ch.toString() // "a"
 6. All String FUnction are valid for StringBuilder too such that charAt(),length() etc.
 */
public class String_Builder 
{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            sb1.append(ch);  // Here O(26) but if we use string it will be O(26 * n^2)
        }
        System.out.println(sb1);

       //System.out.println(sb1.toString());
       System.out.println(sb1.length());
    }
}
