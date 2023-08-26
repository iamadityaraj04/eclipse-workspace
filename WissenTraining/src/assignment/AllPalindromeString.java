/////////////////////////////////////////////////////
//
//  Name of the class : AllPalindromeString
//
//  Responsibility : WAP to display all the palindrome strings in the array. 
//
//  Functions of the class : isPalindrome --> takes string as input and checks that it is a palindrome or not.
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class AllPalindromeString {
    //checks that string is palindrome or not
    static boolean isPalindrome(String str){
        int firstElement=0;
        int lastElement=str.length()-1;
        while(firstElement<lastElement){
            if(str.charAt(firstElement)!=str.charAt(lastElement)){
                return false;
            }
            firstElement++;
            lastElement--;
        }
        return true;
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        String[] array=new String[n];
        System.out.print("Enter the strings of the array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.next();
        }
        sc.close();

        System.out.print("Palindrome strings are: ");
        for(int j=0;j<n;j++){
            if(isPalindrome(array[j])){
                System.out.print(array[j]+" ");
            }
        }
        System.out.println();
    }
}
