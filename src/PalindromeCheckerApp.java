//
//
////@author Rahul Tanay
////@version 13.0
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

            //  Stack Performance
            PalindromeStrategy stackStrategy = new StackStrategy();
            long start1 = System.nanoTime();
            boolean stackResult = stackStrategy.check(input);
            long end1 = System.nanoTime();
            long stackTime = end1 - start1;

            // Deque Performance
            PalindromeStrategy dequeStrategy = new DequeStrategy();
            long start2 = System.nanoTime();
            boolean dequeResult = dequeStrategy.check(input);
            long end2 = System.nanoTime();
            long dequeTime = end2 - start2;

            System.out.println("Input : " + input);
            System.out.println();

            System.out.println("Stack Result : " + stackResult);
            System.out.println("Stack Time   : " + stackTime + " ns");

            System.out.println();

            System.out.println("Deque Result : " + dequeResult);
            System.out.println("Deque Time   : " + dequeTime + " ns");

        }
    }


