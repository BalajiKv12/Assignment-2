//9.Write a Java program to find a missing number in an array.

//initializing package
package Question_09;

//importing scanner library
import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //initializing array arr 
        int arr[] = new int[size];

        //initializing a temporary array of size+1 with all elements as zero

        int arr1[] = new int[size+1];

        //getting array values from user in for loop in range[1,size]

        System.out.println("Enter array elements in range [1,"+size+"]: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }

        // missing numbers will be as zero and other elements present will be one in arr at arr1

        for(int i=0;i<size;i++)
        {
            arr1[arr[i]-1]=1;
        }

        //printing missing numbers

        for(int i=0;i<size;i++)
        {
            if(arr1[i]==0)
            {
                System.out.println("Missing number - "+(i+1));
            }
        }

    }
}