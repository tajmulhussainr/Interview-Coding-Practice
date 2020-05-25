package stringProblems;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(String str) {
        String reverseString = "";
        if (str.isEmpty() || str.isBlank()) {
            throw new RuntimeException("String cannot be Empty or Blank");
        } else {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome(str);
        if (isPalindrome) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        }
    }
}