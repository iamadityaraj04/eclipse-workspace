/////////////////////////////////////////////////////
//
//  Name of the class : PrimeNumbers
//
//  Responsibility : Print n prime numbers.
//
//  Functions of the class :  printPrime --> print first n prime number
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class PrimeNumbers {
    static void printPrime(int number){
        int count,divisor;
        int i=3;
        System.out.print("First "+number+" prime numbers are: ");
        if(number>=1){
            System.out.print(2+" ");
        }
        for(count=2;count<=number;){
            for(divisor=2;divisor<=i-1; divisor++){
                if(i%divisor==0){
                    break;
                }
            }
            if(divisor==i){
                System.out.print(i+" ");
                count++;
            }
        i++;
       }

    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print prime numbers: ");
        int number=sc.nextInt();
        sc.close();
        printPrime(number);
    }
}
