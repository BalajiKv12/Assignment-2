//1. Write a Java program to sum the values of an array and the average value of array elements.

//initializing package
package Question_01;

//importing scanner library
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //intializing array arr 
        int arr[] = new int[size];
        
        //intializing sum and average 

        int sum=0;
        float average=0;

        //getting array values from user calculating sum of array elements in the same for loop

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }

        //calculating average of array arr
        
        average=sum/size;

        //printing sum and average of array elements

        System.out.println("Sum of array elements = "+sum);
        System.out.println("Average of array elements = "+average);
    }
}
