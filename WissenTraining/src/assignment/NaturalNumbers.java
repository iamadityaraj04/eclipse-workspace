/////////////////////////////////////////////////////
//
//  Name of the class : NaturalNumbers
//
//  Responsibility : To print first n natural numbers.
//
//  Functions of the class : naturalNumbers --> It take a number as input and 
//                                              print first n natural numbers;
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class NaturalNumbers {
    //function to print n natural numbers
    public static void naturalNumbers(int number){
        int i=1;
        System.out.print("First "+number+" natural numbers are: ");
        while(i<=number){
            System.out.print(i+" ");
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
        naturalNumbers(number);
    }
}
