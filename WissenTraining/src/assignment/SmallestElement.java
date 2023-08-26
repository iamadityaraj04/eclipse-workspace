/////////////////////////////////////////////////////
//
//  Name of the class : SmallestElement
//
//  Responsibility : Write a program to find smallest element in the array.
//
//  Functions of the class : smallestElement --> this function takes integer array as input and 
//                                               return the smallest number of the array
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;
import java.util.Arrays;
public class SmallestElement {
    //function to return smallest element
    static int smallestElement(int[] array){
        Arrays.sort(array);
        return array[0];
    }
    //main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Smallest Element is: "+ smallestElement(array));
    }
}
