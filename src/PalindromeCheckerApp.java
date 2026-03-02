//
//
////@author Rahul Tanay
////@version 5.0
//


import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String args[]){

        String str = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // pushing characters into deque
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and back
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char back = deque.removeLast();

            if (front != back) {
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


