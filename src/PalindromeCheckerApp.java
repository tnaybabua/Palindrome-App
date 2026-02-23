//
//
////@author Rahul Tanay
////@version 3.0
//



public class PalindromeCheckerApp {
    public static void main(String args[]){
       String name = "madam";
        String copy = "";
        int len = name.length()-1;
       boolean ispalindrome = true;

       //reversing
       for(int i = 0 ; i<=len; i++){
           copy+= name.charAt(len-i);
       }

       //checking for palindrome
        for(int i = 0 ; i<=len ; i++){
            if(name.charAt(i) != copy.charAt(i)){
                ispalindrome = false;
            }
        }


        System.out.println("Is it palindrome = " + ispalindrome);




    }
}

