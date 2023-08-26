/////////////////////////////////////////////////////
//
//  Name of the class : AllPalindrome
//
//  Responsibility : WAP to display all the palindrome numbers in the array.
//
//  Functions of the class : reverse --> reverse the number
//                           isPalindrome --> check that the number is palindrome or 
//                           not using reverse function
/////////////////////////////////////////////////////
package assignment;
import java.util.*;
public class AllPalindrome {
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
        System.out.print("Enter the number of elements of array: ");
        int arrayLength=sc.nextInt();
        int[] array= new int[arrayLength];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<arrayLength;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        System.out.print("Palindrome numberse are: ");
        for(int j=0;j<arrayLength;j++){
            if(isPalindrome(array[j])){
                System.out.print(array[j]+" ");
            }
        }
        System.out.println();
    }
}
