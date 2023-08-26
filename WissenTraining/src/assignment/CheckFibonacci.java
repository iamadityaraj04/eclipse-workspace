package assignment;
import java.util.*;
public class CheckFibonacci {
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
