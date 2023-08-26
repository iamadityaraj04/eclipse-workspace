/////////////////////////////////////////////////////
//
//  Name of the class : NumberPalindrome
//
//  Responsibility : Check given number is palindrom or not.
//
//  Functions of the class : reverse --> this funciton takes a number and reverse it.
//                           isPalindrome--> this function takes reversed number and return 
//                                           that the number is palindrome or not.
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class NumberPalindrome {
    //function to reverse number 
    static int reverse(int number){
        int ans=0;
        while(number>0){
            int remainder=number%10;
            ans=ans*10+remainder;
            number=number/10;
        }
        return ans;
    }
    //function to check palindrome
    static boolean isPalindrome(int number){
        if(number==reverse(number)){
            return true;
        }
        else{
            return false;
        }
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        if(isPalindrome(num)){
            System.out.println(num+" is a palindrome number.");
        }
        else{
            System.out.println(num+" is not a palindrome number.");
        }
    }
}
