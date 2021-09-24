package com.company;

import java.util.Scanner;

public class Keypad_Number
{
    public static String[] number(int n)
    {
        if(n<=1 || n>10)
        {
            System.exit(0);
        }
        if(n == 2)
        {
            String output[] = {"a","b","c"};
            return output;
        }
        else if(n == 3)
        {
            String output[] = {"d","e","f"};
            return output;
        }
        else if(n == 4)
        {
            String output[] = {"g","h","i"};
            return output;
        }
        else if(n == 5)
        {
            String output[] = {"j","k","l"};
            return output;
        }
        else if(n == 6)
        {
            String output[] = {"m","n","o"};
            return output;
        }
        else if(n == 7)
        {
            String output[] = {"p","q","r","s"};
            return output;
        }
        else if(n == 8)
        {
            String output[] = {"t","u","v"};
            return output;
        }
        else
        {
            String output[] = {"w","x","y","z"};
            return output;
        }

    }

    public static void printNumbers(int n,String output)
    {
        if (n <= 0)
        {
            System.out.print(output+" ");
            return;
        }

        String num[] = number(n%10);

        for (int i=0 ; i< num.length ; i++)
        {
            printNumbers(n/10,num[i]+output);
        }
    }

    public static void printNumbers(int input)
    {
        printNumbers(input,"");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number : ");
        int s = scan.nextInt();
        printNumbers(s);
    }
}
