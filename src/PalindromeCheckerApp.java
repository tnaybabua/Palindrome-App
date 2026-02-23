//
//
////@author Rahul Tanay
////@version 3.0
//



public class PalindromeCheckerApp {
    public static void main(String args[]){
       String name = "madam";
       int start = 0;
       int end = name.length()-1;

       boolean ispalindrome = true;

        while(start<=end){
            if(name.charAt(start) != name.charAt(end)){
                ispalindrome = false;
            }
            start++;
            end--;
        }


        System.out.println("Input = " + name);
        System.out.println("Is it palindrome = " + ispalindrome);




    }
}

