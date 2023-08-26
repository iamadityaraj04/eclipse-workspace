/////////////////////////////////////////////////////
//
//  Name of the class : Factorial
//
//  Responsibility : Find factorial of a number
//
//  Functions of the class : factorial --> It take a number as input and 
//                                         print factorial of that number;
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class Factorial {
    //function to calculate factorial
    static int factorial(int number){
        int result=1;
        for(int i=1;i<=number;i++){
            result*=i;
        }
        return result;
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int number=sc.nextInt();
        sc.close();
        System.out.println("Factorial of "+number+" is: " + factorial(number));
    }
}
