/////////////////////////////////////////////////////
//
//  Name of the class : SearchElementBS
//
//  Responsibility : WAP to find an element in the array using binary search.
//
//  Functions of the class : binarySearch --> search elements using binary search.
/////////////////////////////////////////////////////
package assignment;
import java.util.Scanner;
import java.util.Arrays;
public class SearchElementBS {
    //function to search element in array using binary search
    static boolean binarySearch(int num, int[] array){
        int l=0;
        int r=array.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(array[mid]==num){
                return true;
            }
            if(array[mid]<num){
                l=mid+1;
            }
            else{
                r=mid-1;
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
            System.out.print("Enter the number to find : ");
            int number=sc.nextInt();
            sc.close();
            Arrays.sort(array);
            if(binarySearch(number,array)){
                System.out.println("Element Found!");
            }
            else{
                System.out.println("Element Not Found!");
            }
    }
}

