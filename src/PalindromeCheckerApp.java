//
//
////@author Rahul Tanay
////@version 10.0
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
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        String input = sc.nextLine();

        // Pre-processing
        input = input.toLowerCase().replace(" ", "");

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);


    }
}


