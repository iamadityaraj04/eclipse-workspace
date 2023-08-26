/////////////////////////////////////////////////////
//
//  Name of the class : CheckPrime
//
//  Responsibility : Check given number is prime or not.
//
//  Functions of the class : isPrime --> checks wether the number is prime or not.
//
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;
public class CheckPrime {
    //function to check that the number is prime or not
    static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        else if(number==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        sc.close();
        //calling function to check prime number
        if(isPrime(number)){
            System.out.println(number+" is a prime number.");
        }
        else{
            System.out.println(number+" is not a prime number.");
        }
    }
}
