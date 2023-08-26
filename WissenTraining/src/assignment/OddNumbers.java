/////////////////////////////////////////////////////
//
//  Name of the class : OddNumbers
//
//  Responsibility : To print n odd numbers.
//
//  Functions of the class : oddNumbers --> It take a number as input and 
//                                              print first n odd numbers;
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

public class OddNumbers {
    //function to print n odd numbers
    static void oddNumbers(int number){
        System.out.print("First "+number+" odd numbers are: ");
        int count=0;
        int i=1;
        while(count<number){
            if(i%2==1){
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
        oddNumbers(number);
    }
}