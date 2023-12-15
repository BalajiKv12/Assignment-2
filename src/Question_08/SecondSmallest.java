//8. Write a Java program to find the second smallest element in an array.

//initializing package
package Question_08;

//importing scanner library
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //initializing array arr with size 
        int arr[] = new int[size];

        //getting array values from user in for loop

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        //initializing minimum1 and minimum2 variables with first element of array
        //mini1 - smallest, mini2 - Second smallest
        int mini1=arr[0],mini2=arr[0];

        //finding maximum and minimum elements of array using for loop

        for(int i=0;i<size;i++)
        {
            if(mini1>arr[i])
            {
                mini2=mini1;
                mini1=arr[i];
            }
            else if(mini2>arr[i])
            {
                mini2=arr[i];
            }
        }
        //printing Second smallest value

        System.out.println("Second Smallest element in array = "+mini2);
    }
}
