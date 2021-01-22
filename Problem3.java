/*Take 20 integer inputs from user and print the following:
  number of positive numbers
  number of negative numbers
  number of odd numbers
  number of even numbers
  number of 0s 
*/

import java.util.*;


public class Problem3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[20];
        
        int i = 0;

        while(i<inputs.length)
        {
            System.out.println("Enter element number: "+(i+1));
            inputs[i] = sc.nextInt();
            i++;
        }
        
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int oddNumbers = 0;
        int evenNumbers = 0; 
        int zeroes = 0;

        for(int num=0; num<inputs.length; num++)
        {
            if(inputs[num]>0)
                positiveNumbers = positiveNumbers + 1;
            
            if(inputs[num]<0)
                negativeNumbers = negativeNumbers + 1;

            if(inputs[num]%2!=0)
                oddNumbers = oddNumbers + 1;

            if(inputs[num]%2==0)
                evenNumbers = evenNumbers + 1;
            
            if(inputs[num] == 0)
                zeroes = zeroes + 1;
        }

        System.out.println("The total number of positive numbers: "+ positiveNumbers);
        System.out.println("The total number of negative numbers: "+ negativeNumbers);
        System.out.println("The total number of odd numbers: "+ oddNumbers);
        System.out.println("The total number of even numbers: "+ evenNumbers);
        System.out.println("The total number of zeroes: "+ zeroes);

        sc.close();
    }
}
