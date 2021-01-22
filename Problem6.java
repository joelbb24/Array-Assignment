/*Write a program to check if elements of an array are same or not 
read it from front or back.*/

import java.util.*;

public class Sixth 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,5,4,3,2,1};

        int[] reverse = new int[arr.length];
        int i=0;
        int j=arr.length-1;

        while(i<reverse.length)
        {
            reverse[i] = arr[j];
            i++;
            j--;
        }

        if(Arrays.equals(arr, reverse))
        {
            System.out.println("Both arrays are equal from front and back.");
        }
        else
        {
            System.out.println("Both arrays are not equal from front and back.");
        }

    }    
}
