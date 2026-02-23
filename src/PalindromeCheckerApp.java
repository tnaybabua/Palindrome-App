//
//
////@author Rahul Tanay
////@version 2.0
//



public class PalindromeCheckerApp {
    public static void main(String args[]){
       String name = "madam";

       boolean ispalindrome = true;
       int len = name.length() -1;
       for(int i = 0 ; i<(len/2) ; i++){
           if(name.charAt(i) != name.charAt(len-i)){
               ispalindrome =  false;
           }
       }

       System.out.println("Is it a Palindrome? : " + ispalindrome);



    }
}

