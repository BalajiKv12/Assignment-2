//7. Write a Java program to find common elements between two integer arrays

//initializing package
package Question_07;

//importing scanner library
import java.util.Scanner;

public class CommonElements{
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //intializing array arr 1
        int arr1[] = new int[size];

        //intializing array arr 2
        int arr2[] = new int[size];

        //getting array-1 values from user in for loop

        System.out.println("Enter array-1 elements : ");
        for(int i=0;i<size;i++)
        {
            arr1[i]=scan.nextInt();
        }

        //getting array-2 values from user in for loop

        System.out.println("Enter array-2 elements : ");
        for(int i=0;i<size;i++)
        {
            arr2[i]=scan.nextInt();
        }

        //initializing counter variable count and temporary variable
        int count=0,s=-1;

        //finding common elements between two integer arrays using two for loop 

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr1[i]==arr2[j] && arr1[i]!=s)
                {
                    count=count+1;
                }
            }
            //printing common elements in both arrays
            if(count>=1)
            {
                System.out.println("Common Elements : "+arr1[i]);
                //assigning arr1[i] to temporary variable to avoid repeatation
                s=arr1[i];
            }
            //setting count variable to zero at end of each iteration
            count=0;        
        }
    }
}