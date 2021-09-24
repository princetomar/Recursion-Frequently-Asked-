package com.company;

import java.util.Scanner;

public class BinarySearch
{
    public static int bsearch(int arr[],int l,int h,int x)
    {
        if (l > h) {
            return -1;
        }

        int mid = (l + h) / 2;
        if (arr[mid] == x){
            return mid;
        }
        else if(arr[mid] > x){
            return bsearch(arr,l,mid-1,x);
        }
        else{
            return bsearch(arr,mid+1,h, x);
        }

    }

    public static int bsearch(int arr[], int x)
    {
        return bsearch(arr,0,arr.length-1,x);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("enter array elements : ");
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.print("element to be searched in array : ");
        int x = scan.nextInt();
        System.out.println(bsearch(arr,x));
    }
}
