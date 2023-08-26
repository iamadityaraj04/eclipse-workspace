/////////////////////////////////////////////////////
//
//  Name of the class : StringPalindrome
//
//  Responsibility : Check given string is palindrome or not.
//
//  Functions of the class :  isPalindrome --> this function takes string as a input and check
//                                             that the string is palindrome or not.
//
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class StringPalindrome {
    static boolean isPalindrome(String str){
        String reverseString="";
        for(int i=str.length()-1;i>=0;i--){
            reverseString = reverseString + str.charAt(i);
        }
        if(reverseString.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.next();
        sc.close();
        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome.");
        }
        else{
            System.out.println(str+" is not a palindrome.");
        }
    }
}
