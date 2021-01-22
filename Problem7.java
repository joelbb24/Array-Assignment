/*Write a program to shift every element of an array to circularly right. 
E.g.-INPUT: 1 2 3 4 5
     OUTPUT: 5 1 2 3 4
*/



public class Seventh 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5};
        int[] result = shiftRight(arr);

        for(int i: result)
            System.out.print(i+" ");
    }    

    static int[] shiftRight(int[] arr)
    {
        int temp = arr[arr.length-1];
        for(int i = arr.length-1; i>0; i--)
        {
            if(i>0)
                arr[i] = arr[i-1];
        }

        arr[0] = temp;

        return arr;
    }
}
