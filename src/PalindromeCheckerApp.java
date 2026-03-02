//
//
////@author Rahul Tanay
////@version 12.0
//

import java.util.*;
// (Interface)
interface PalindromeStrategy {
    boolean check(String input);
}

//  Stack  Method
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++)
            stack.push(input.charAt(i));

        for (int i = 0; i < input.length(); i++)
            if (input.charAt(i) != stack.pop())
                return false;

        return true;
    }
}

//  Deque Method
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++)
            deque.addLast(input.charAt(i));

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }
}


    public class PalindromeCheckerApp {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input");
            String input = sc.nextLine();

            PalindromeStrategy strategy = new StackStrategy();
            // PalindromeStrategy strategy = new DequeStrategy();

            boolean result =  strategy.check(input);

            System.out.println("Input : " + input);
            System.out.println("Method Used : " + strategy.getClass().getSimpleName());
            System.out.println("Is Palindrome? : " + result);


        }
    }


