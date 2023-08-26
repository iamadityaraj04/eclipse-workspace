/////////////////////////////////////////////////////
//
//  Name of the class : PrimeInArray
//
//  Responsibility : WAP to print all the prime numbers in the array. 
//
//  Functions of the class : isPrime --> used to check that the number is prime or not.
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class PrimeInArray {
    //function to check that the number is prime or not
    static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        else if(number==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
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
        System.out.print("Prime Numbers are: ");
        for(int i=0;i<arrayLength;i++){
            if(isPrime(array[i])){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
