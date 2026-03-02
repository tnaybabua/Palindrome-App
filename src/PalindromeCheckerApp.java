//
//
////@author Rahul Tanay
////@version 9.0
//


import java.util.*;
public class PalindromeCheckerApp {
    static boolean isPalindrome(String str, int start, int end) {

        // Base case
        if (start >= end)
            return true;

        // If mismatch
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }



    public static void main(String args[]) {

        String input = "level";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);


    }
}


