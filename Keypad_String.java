package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Keypad_String {
	
	public static String[] SingleDigit(int n)
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

	public static String[] keypad(int n)
	{
		if(n == 0)
		{
			String output[]= {""};
			return output;
		}
		String smallerNumberArray [] = keypad(n/10);
		String singleDigitOutput[] = SingleDigit(n%10);
		String output[] = new String[singleDigitOutput.length * smallerNumberArray.length ];
		int k=0;
		for (int i=0 ; i<singleDigitOutput.length ; i++)
		{
			for (int j=0 ; j<smallerNumberArray.length ; j++)
			{
				output[k] = smallerNumberArray[j]+ singleDigitOutput[i];
				k++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter n : ");
		int n = scan.nextInt();
		System.out.println(Arrays.toString(keypad(n)));
	}
		

}
