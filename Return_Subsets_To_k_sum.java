package com.company;

public class Return_Subsets_To_k_sum
{
    // Let us suppose that we have this array - [3,2,5,4,6,1]  and estimated sum ( k ) = 8
    // Therefore the pairs are (3,5), (3,4,1), (2,6), (2,5,1)
    // As we can see there are some subsets which include the first element and the others doesn't include.



    public static int [][] subsetSum(int arr[], int si , int k)
    {
        if (si == arr.length)
        {
            if (k == 0)
            {
                return new int[1][0];
            }
            else {
                return new int[0][0];
            }
        }
        // Creating a recursive array in which first element is not included
        int [][] smallOutput1 = subsetSum(arr,si+1, k);
        // Creating a recursive array in which first element is included
        int [][] smallOutput2 = subsetSum(arr, si+1, k- arr[si]);
        int [][] output  = new int[smallOutput1.length+ smallOutput2.length][];

        int index = 0;
        for (int i=0 ; i< smallOutput1.length ; i++)
        {
            output[index++] = smallOutput1[i];
        }
        // Copying elements from second array which includes the first index
        for (int i=0 ; i< smallOutput2.length ; i++)
        {
            output[index] = new int[smallOutput2[i].length+1];
            // Assinging 0th index value to 0th  column of output
            output[index][0] = arr[si];
            for (int j=0 ; j< smallOutput2[i].length ; j++)
            {
                output[index][j+1] = smallOutput2[i][j];
            }
            index++;

        }
        return output;
    }

    public static int [][] subSet_Sums_To_K(int input[], int k)
    {
        return subsetSum(input, 0,k);
    }

    public static void main(String[] args) {
        int arr[] = {5,12,3,17,1,18,3,17};
        int s[][] = subSet_Sums_To_K(arr,6);
       for (int i=0 ; i< s.length ; i++)
       {
           for (int j=0 ; j< s.length ; j++)
           {
               System.out.print(s[i][j]+" ");
           }
           System.out.println();
       }
    }
}
