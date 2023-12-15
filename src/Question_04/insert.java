//4. Write a Java program to insert an element (specific position) into an array.

//initializing package
package Question_04;

//importing scanner library
import java.util.Scanner;

public class insert {
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //initializing array arr with size + 1
        int arr[] = new int[size+1];

        //getting array values from user in for loop

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        //getting an element from user to insert in array

        System.out.println("Enter an element to insert:");
        int element = scan.nextInt();

        //getting an index from user to insert the element in array

        System.out.println("Enter the index to insert:");
        int index = scan.nextInt();

        //inserting the element from array using for loop
        for(int i=size-1;i>index-1;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=element;

        //printing the inserted array

        System.out.println("The array elements after inserting : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
