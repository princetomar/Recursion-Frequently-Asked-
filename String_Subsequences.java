package com.company;

import java.util.Scanner;

public class String_Subsequences
{
    public static String[] findSubsequence(String str)
    {
        if (str.length() == 0)
        {
            String arr[] = {""};
            return arr;
        }

        String smallAns [] = findSubsequence(str.substring(1));
        int smallAns_length = smallAns.length;

        String result[] = new String[2*smallAns_length];
        int k=0;

        for (int i=0 ; i<smallAns_length ; i++) {
            result[k] = smallAns[i];
            k++;
        }

        for (int i=0 ; i<smallAns_length ; i++) {
            result[k] = str.charAt(0) + smallAns[i];
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string : ");
        String sub = scan.next();
        String res[] = findSubsequence(sub);
        for (int i=0 ; i<res.length ; i++)
        {
            System.out.println(res[i]);
        }

    }
}
