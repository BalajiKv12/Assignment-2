//3. Write a Java program to remove a specific element from an array.

//initializing package
package Question_03;

//importing scanner library
import java.util.Scanner;

public class remove {
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //initializing array arr 
        int arr[] = new int[size];

        //initializing array a for stroing elements after removing
        int a[]=new int[size-1];

        //getting array values from user in for loop

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        //getting an element from user to remove from array

        System.out.println("Enter an element to remove:");
        int element = scan.nextInt();

        //removing the element from array using for loop
        for(int i=0,k=0;i<size;i++)
        {
            if(element!=arr[i])
            {
                a[k]=arr[i];
                k++;
            }
        }
    
        //printing the corrected array

        System.out.println("The array elements after removing : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
