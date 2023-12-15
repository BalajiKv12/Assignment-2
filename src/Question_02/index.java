//2. Write a Java program to find the index of an array element.

//initializing package
package Question_02;

//importing scanner library
import java.util.Scanner;

public class index {
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //intializing array arr 
        int arr[] = new int[size];

        //getting array values from user in for loop

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        //getting an element from user 

        System.out.println("Enter an element :");
        int element = scan.nextInt();

        //printing the index value of the given element in for loop

        for(int i=0;i<size;i++)
        {
            //checking whether the given element is in array or not using if condition

            if(element==arr[i])
                System.out.println("Index of array element "+element+" is in "+(i+1));  
        }
    }
}