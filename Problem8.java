//Selection Sort

public class Eighth 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,3,1,45,15};

        for(int i=0; i<arr.length; i++)
        {
            if(i+1<arr.length)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[i]>arr[j])
                        swap(arr, i, j);
                }
            }
        }


        for(int i: arr)
            System.out.print(i+" ");
    }


    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
