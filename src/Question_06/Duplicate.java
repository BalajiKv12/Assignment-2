//6. Write a Java program to find duplicate values in an array of string values.

//initializing package
package Question_06;

//importing scanner library
import java.util.Scanner;

public class Duplicate {
    public static void main(String args[])
    {
        //initializing scanner function 
        Scanner scan = new Scanner(System.in);

        //getting array size from user
        System.out.println("Enter array size : ");
        int size = scan.nextInt();

        //initializing string array str with size 
        String str[] = new String[size];

        //getting array values from user in for loop

        System.out.println("Enter String array elements : ");
        for(int i=0;i<size;i++)
        {
            str[i]=scan.next();
        }

        //initializing counter variable count
        int count=0;

        //initializing temporary string array str with size to avoid repeatation 
        String s[] = new String[size];

        //finding the duplicate elements in the string array using 2 for loops

        for(int i =0;i<size;i++)
        {
            for(int j=0,k=0;j<size;j++)
            {
                if(str[i].equals(str[j]) && !str[i].equals(s[k]))
                {
                    count=count+1;
                    k++;
                }
            }

            //printing duplicate elements in string array
            if(count>1)
            {
                System.out.println("Duplicate Elements : "+str[i]);
                //assigning str[i] to temporary string array to avoid repeatation in printing
                s[i]=str[i];
            }
            //setting count variable to zero at end of each iteration
            count=0;
        }
    }
}