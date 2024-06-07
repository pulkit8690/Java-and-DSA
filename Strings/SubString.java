/*
 1. Use substring function
    eg. s1.substring(startindex, endIndex)
 */
import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1=sc.nextLine();
        System.out.println(str1.substring(0, 5));
        sc.close();
    }
}
