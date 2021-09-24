package com.company;

import java.util.Scanner;

public class Print_All_Codes
{
    public static char getChar(int n) {
        return (char) ( n+96);
    }

    public static void getCode(String input, String ans)
    {
        if (input.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        int firstDigit = input.charAt(0) - '0';
        getCode(input.substring(1),ans + getChar(firstDigit));

        // But if it's length is greater than 1
        if (input.length() > 1)
        {
            int firstTwoDigit = (input.charAt(0) - '0')*10 + (input.charAt(1) - '0');
            if (firstTwoDigit >10 && firstTwoDigit <= 26)
            {
                getCode(input.substring(2), ans+ getChar(firstTwoDigit));
            }
        }
    }

    public static void getCode(String input)
    {
        getCode(input,"");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string : ");
        String s = scan.next();
        getCode(s);
    }
}
