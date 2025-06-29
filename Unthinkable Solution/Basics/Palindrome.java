package Basics;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return num == rev;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}
