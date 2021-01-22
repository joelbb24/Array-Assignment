//Take 10 integer inputs from user and store them in an array. Again,ask user to give a number. Now, tell user whether that number is present in array or not.


import java.util.*;

public class Second 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[10];
        
        int i = 0;

        while(i<inputs.length)
        {
            System.out.println("Enter element number: "+(i+1));
            inputs[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter an element to be searched: ");
        int value = sc.nextInt();

        if(presentOrNot(inputs, value)==true)
            System.out.println("The element you searched is present in the array.");
        else
            System.out.println("Element not found.");


        sc.close();
    }    

    static boolean presentOrNot(int[] inputs, int value)
    {
        for(int in: inputs)
        {
            if(in==value)
            {
                return true;
            }
        }
            
        return false;
    }
}
