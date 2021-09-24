public class Print_Subset
{
    public static void PrintSubsets(int arr[],int si, int output[])
    {
        // Base case :
        if (si == arr.length)
        {
            for (int i: output)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        // Else recursive part starts from here
        int [] newOutput = new int[output.length +1];
        int i=0;
        // copying the content of output array in newOutput
        for (; i< output.length ; i++)
        {
            newOutput[i] = output[i];
        }
        newOutput[i] = arr[si];
        PrintSubsets(arr,si+1,output);
        PrintSubsets(arr,si+1,newOutput);

    }

    public static void printSubsets(int arr[])
    {
        int output[] = new int[0];
        PrintSubsets(arr,0,output);
    }

    public static void main(String[] args) {
        int arr[] = {15,20,12};
        printSubsets(arr);
    }
}
