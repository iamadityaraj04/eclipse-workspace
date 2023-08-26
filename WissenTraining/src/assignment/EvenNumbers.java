/////////////////////////////////////////////////////
//
//  Name of the class : EvenNumbers
//
//  Responsibility : To print n even numbers.
//
//  Functions of the class : evenNumbers --> It take a number as input and 
//                                              print first n even numbers;
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class EvenNumbers {
    //function to print n even numbers
    static void evenNumbers(int number){
        System.out.print("First "+number+" even numbers are: ");
        int count=0;
        int i=1;
        while(count<number){
            if(i%2==0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println();
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        sc.close();
        evenNumbers(number);
    }
}
