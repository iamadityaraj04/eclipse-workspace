/////////////////////////////////////////////////////
//
//  Name of the class : SearchElementIndex
//
//  Responsibility : program to specify at which location the element is found.
//
//  Functions of the class : searchElementIdx --> finds index of the element in array
//
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;
public class SearchElementIndex {
    //function to find the element
    static int searchElementIdx(int number, int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]==number){
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter the number to find its location : ");
        int number=sc.nextInt();
        sc.close();
        int result=searchElementIdx(number, array);
        if(result==-1){
            System.out.println("Element Not Found!");
        }
        else{
            System.out.println("Element is located at index: "+result);
        }
    }
}
