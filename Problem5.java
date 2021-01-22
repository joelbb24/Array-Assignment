//Find largest and smallest elements of an array.


public class Problem5
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int maxValue = arr[0];
        int minValue = arr[0];

        for(int i: arr)
        {
            if(i>maxValue)
                maxValue = i;
        }

        for(int i: arr)
        {
            if(i<minValue)
                minValue = i;
        }

        System.out.println("The largest value is: "+maxValue);
        System.out.println("The smallest value is: "+ minValue);
    }    
}
