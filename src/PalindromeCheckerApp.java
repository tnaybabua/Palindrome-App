//
//
////@author Rahul Tanay
////@version 5.0
//


import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String args[]){

            String str = "madam";

            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            // pushing char from string to both stack and queue
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                stack.push(ch);
                queue.add(ch);
            }

            boolean isPalindrome = true;

            // Compare elements
            while (!stack.isEmpty()) {
                if (stack.pop() != queue.remove()) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }




    }
}

