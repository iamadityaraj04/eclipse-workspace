/////////////////////////////////////////////////////
//
//  Name of the class : SearchElement
//
//  Responsibility : WAP to search an element in the array.
//
//  Functions of the class : searchElement --> search wether element is present in the array or not
//
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;
public class SearchElement {
    //function to find the element
    static boolean searchElement(int number, int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]==number){
                return true;
            }
        }
        return false;
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
        System.out.print("Enter the number to find in array: ");
        int number=sc.nextInt();
        sc.close();
        if(searchElement(number, array)){
            System.out.println("Element Found!");
        }
        else{
            System.out.println("Element Not Found!");
        }
    }
}
