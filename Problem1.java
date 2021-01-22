
//Take 10 integer inputs from user and store them in an array and print them on screen.

import java.util.*;

public class Problem1
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

        for(int in: inputs)
            System.out.print(in+" ");


        sc.close();
    }
}
