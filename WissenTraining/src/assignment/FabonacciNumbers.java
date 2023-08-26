/////////////////////////////////////////////////////
//
//  Name of the class : FabonacciNumbers
//
//  Responsibility : Print n fibonacci numbers.
//
//  Functions of the class : fabonacci --> this function takes a number as input and 
//                                         print fabonacci series
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class FabonacciNumbers {
    // function to print fabonacci series
    static void fabonacci(int number){
        int firstNumber=0;
        int secondNumber=1;
        int i;
        System.out.print("Fibonacii Numbers are: ");
        if(number<1){
            return;
        }
        System.out.print(firstNumber+" ");
        for(i=1;i<number;i++){
            System.out.print(secondNumber+" ");
            int nextNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
        System.out.println();
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check that a number is fibonacci number : ");
        int number=sc.nextInt();
        sc.close();
        fabonacci(number);
    }
}
