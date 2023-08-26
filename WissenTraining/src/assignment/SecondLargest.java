/////////////////////////////////////////////////////
//
//  Name of the class : SecondLargest
//
//  Responsibility : WAP to find second largest element in the array.
//
//  Functions of the class : secLargestElement--> this function takes integer array as input and 
//                                               return the second largest number of the array
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest {
    //function to return second largest element
    static int secLargestElement(int[] array){
        Arrays.sort(array);
        return array[array.length-2];
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
        System.out.println("Smallest Element is: "+ secLargestElement(array));
    }
}
