//10. Write a Java program to check if an array of integers is without 0 and -1

//initializing package
package Question_10;

//importing scanner library
import java.util.Scanner;

public class ZeroOne {
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

        //initializing counter variable count for counting zero and count1 for counting one
        int count=0,count1=0;


        //checking whether 0 and -1 are present in array or not using for loop

        for(int i=0;i<size;i++)
        {
            if(arr[i]==0)
                count=count+1;
            else if(arr[i]==-1)
                count1=count1+1;
        }

        //printing whether 0 and -1 is present in array or not

        if(count>0 && count1>0)
            System.out.println("0 and -1 are present in the array.");
        else if(count>0)
            System.out.println("0 is present in the array.\n"+"-1 is not present in array.");
        else if(count1>0)
            System.out.println("-1 is present in the array.\n"+"0 is not present in array.");
        else
            System.out.println("0 and -1 are not present in the array.");
    }
}

