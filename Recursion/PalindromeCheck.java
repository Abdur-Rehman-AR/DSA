import java.util.Scanner;

public class PalindromeCheck {

    public boolean isPalindrome(String s, int i, int j){

        if(i >= j) return true;
        else
        {
            if(s.charAt(i) == s.charAt(j)) return isPalindrome(s, i+1, j-1);
            else return false;
        }      
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = "";

        while(true){
            System.out.print("Enter text to find, is Palindrome: ");
            n = sc.next();

            if(n.length() == 0){
                System.out.println("Please enter a valid string.");
            } else {
                break;
            }
        }

        PalindromeCheck p = new PalindromeCheck();
        boolean result = p.isPalindrome(n, 0, n.length()-1);
        if(result) System.out.println(n + " is a palindrome.");
        else System.out.println(n + " is not a palindrome.");
        sc.close();
    }
}