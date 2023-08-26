/////////////////////////////////////////////////////
//
//  Name of the class : CheckFabonacci
//
//  Responsibility : Take a number and check whether it is a fibonacci number or not. 
//
//  Functions of the class : checkFibonacci --> this function takes a number as input and 
//                                              checks that the number is fibonacci number or not.
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;
public class CheckFabonacci {
    //function to check fibonacci number
    static boolean checkFibonacci(int number){
        int firstNumber=0;
        int secondNumber=1;
        int i;
        if(number==0){
            return true;
        }
        for(i=1;i<=number;i++){
            int nextNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
            if(nextNumber==number){
                return true;
            }
        }
        return false;
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print the series: ");
        int number=sc.nextInt();
        sc.close();
        if(checkFibonacci(number)==true){
            System.out.println("It is a fibonacci number.");
        }
        else{
            System.out.println("It is not a fibonacci number.");
        }
    }
}
