//
//
////@author Rahul Tanay
////@version 11.0
//

import java.util.*;
    class PalindromeChecker {

        public boolean checkPalindrome(String input) {

            if (input == null)
                return false;

            input = input.toLowerCase().replace(" ", "");

            Stack<Character> stack = new Stack<>();

            // Push characters
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            // Compare
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
}
    public class PalindromeCheckerApp {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input");
            String input = sc.nextLine();

            PalindromeChecker checkObj = new PalindromeChecker();

            boolean result = checkObj.checkPalindrome(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);


        }
}


