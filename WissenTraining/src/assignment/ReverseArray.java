/////////////////////////////////////////////////////
//
//  Name of the class : ReverseArray
//
//  Responsibility : Wap to reverse the elements of the array.
//
//  Functions of the class : reverse --> function is used to reverse the array using swap method.
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;

//function to swap the elements
public class ReverseArray {
    static void reverse(int array[]){
        int firstElement=0;
        int lastElement=array.length-1;
        while(firstElement<lastElement){
            int temp=array[firstElement];
            array[firstElement]=array[lastElement];
            array[lastElement]=temp;
            firstElement++;
            lastElement--;
        }
    }
    // main function
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
        reverse(array);
        //printing element
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
   } 
}
