//
//
////@author Rahul Tanay
////@version 4.0
//


import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String args[]){
        String str = "madam";
        Stack<Character> stack = new Stack<>();

        //pushing
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        //poping
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        //compare before and after
        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }




    }
}

