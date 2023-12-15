//5. Write a Java program to find the maximum and minimum value of an array.

//initializing package
package Question_05;

//importing scanner library
import java.util.Scanner;

public class MaxMin {
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

        //initializing maximum and minimum variables with first element of array

        int maxi=arr[0],mini=arr[0];

        //finding maximum and minimum elements of array using for loop

        for(int i=0;i<size;i++)
        {
            if(maxi<arr[i])
            {
                maxi=arr[i];
            }
            if(mini>arr[i])
            {
                mini=arr[i];
            }
        }

        //printing maximum and minimum values

        System.out.println("Maximum element in array = "+maxi);
        System.out.println("Minimum element in array = "+mini);
    }
}