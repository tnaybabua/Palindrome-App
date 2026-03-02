//
//
////@author Rahul Tanay
////@version 8.0
//


import java.util.*;
public class PalindromeCheckerApp {


    // Node class with constrctor
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }


    static Node buildList(String str) {

        Node head = new Node(str.charAt(0));
        Node current = head;

        for (int i = 1; i < str.length(); i++) {
            current.next = new Node(str.charAt(i));
            current = current.next;
        }

        return head;
    }

    static boolean isPalindrome(Node head, int size) {

        char[] arr = new char[size];

        Node current = head;

        // Copy linked list into array (normal for loop)
        for (int i = 0; i < size; i++) {
            arr[i] = current.data;
            current = current.next;
        }

        // Check palindrome using normal for loop
        for (int i = 0; i < size / 2; i++) {
            if (arr[i] != arr[size - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        String input = "level";

        Node head = buildList(input);

        boolean result = isPalindrome(head, input.length());

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);


    }
}


