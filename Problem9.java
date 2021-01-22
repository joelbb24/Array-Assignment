/*Input any number. Find the sum 
  of the digits of the number using a recursive function.
*/

import java.util.*;
import java.lang.*;

public class Ninth 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Input a number: ");
        int input = sc.nextInt();
        
        int result = sumOfInput(input);
        System.out.println("The sum of individual digits is: "+ result);
        sc.close();
    }   
    
    static int sumOfInput(int input)
    {
        if(input/10==0)
            return input%10;

        return input%10 + sumOfInput(input/10);
    }
}
