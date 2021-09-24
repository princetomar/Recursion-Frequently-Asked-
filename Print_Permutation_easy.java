package com.company;

public class Print_Permutation_easy
{
    public static void swap(String string,int i,int j)
    {
        char [] str = string.toCharArray();
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void permutation(String str,int l, int r)
    {
        if (l == r)
        {
            System.out.println(str);
            return;
        }

        for (int i=l ; i<=r ; i++)
        {
            swap(str,l,r);
            permutation(str,l+1,r);
            swap(str,l,i);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str,0, args.length-1);

    }
}
