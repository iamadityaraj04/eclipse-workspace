/////////////////////////////////////////////////////
//
//  Name of the class : reverseNumber
//
//  Responsibility : Print the reverse of a number 123 --> 321 
//
//  Functions of the class : revNumber --> this function take a number and
//                                         reverse that number
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class reverseNumber {

    //function to reverse the number
    static int revNumber(int number){
        int ans=0;
        while(number>0){
            int remainder=number%10;
            ans=ans*10+remainder;
            number=number/10;
        }
        return ans;
    }
    
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int number=sc.nextInt();
        sc.close();
        System.out.println(revNumber(number));
    }
}
