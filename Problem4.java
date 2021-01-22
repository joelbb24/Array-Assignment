/*Take 10 integer inputs from user and store them in an array. 
  Now, copy all the elements in another array 
  but in reverse order.*/

import java.util.*;


public class Fourth 
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

        int[] copyInReverse = new int[inputs.length];

        int num = inputs.length-1;
        int j = 0;
        while(num>=0)
        {
            copyInReverse[j] = inputs[num];
            j++;
            num--;
        }


        for(int k: copyInReverse)
            System.out.print(k+" ");


        sc.close();
    }    
}
