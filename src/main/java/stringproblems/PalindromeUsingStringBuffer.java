package stringproblems;

import java.util.Scanner;

public class PalindromeUsingStringBuffer {

    public boolean isPalindrome(String str) {
        if (str.isEmpty() || str.isBlank()) {
            throw new RuntimeException("String cannot be Empty or Blank");
        }
        StringBuffer sb = new StringBuffer(str);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        PalindromeUsingStringBuffer palindrome = new PalindromeUsingStringBuffer();
        if (palindrome.isPalindrome(str)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

    }
}
