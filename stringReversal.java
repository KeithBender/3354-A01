import java.util.Scanner;

//Keith Bender
//CS3354-A01

public class stringReversal 
{
	public static void main(String[] args) 
	{
		String input;
		
		char [] inputChar, reversed, subStringEven, subStringOdd, subStringEvenReverse, subStringOddReverse;
		int sizeEven = 0, 
			sizeOdd = 0;
		
		System.out.println("This Program Will do two things:");
		System.out.println("1. Take a string and reverse it");
		System.out.println("2. Generates a new string by concatenating the reversed substring of even and odd indexes.");
		
		System.out.println();
		
		System.out.println("Part 1");
		System.out.println("Please Enter a String: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		
		inputChar = input.toCharArray();
		reversed = input.toCharArray();
		
		reverse rv = new reverse();
		rv.reverseMethod(inputChar, reversed);
		
		System.out.println("The Reverse of that string is: ");
		System.out.println(reversed);
		System.out.println();
		
		System.out.println("Part 2:");
		System.out.println("Please Enter another String: ");
		input = sc.nextLine();
		sc.close();
		
		System.out.println();
		System.out.println("Input:" + input);
		System.out.println();
		
		inputChar = input.toCharArray();
		
		for (int i = 0; i < inputChar.length; i++) 
		{
			if ((i % 2) == 0)
			{
				sizeEven++;
			} 
			else 
			{
				sizeOdd++;
			}
		}
		
		subStringEven = new char[sizeEven];
		subStringOdd = new char[sizeOdd];
		
		for (int i = 0, j = 0, k = 0; i < inputChar.length; i++) 
		{
			if ((i % 2) == 0) 
			{
				subStringEven[j] = inputChar[i];
				j++;
			} 
			else 
			{
				subStringOdd[k] = inputChar[i];
				k++;

			}
		}
		
		System.out.println("Substring for Even: ");
		System.out.println(subStringEven);
		System.out.println("Substring for Odd: ");
		System.out.println(subStringOdd);
		
		subStringEvenReverse = new char[sizeEven];
		subStringOddReverse = new char[sizeOdd];
		rv.reverseMethod(subStringEven, subStringEvenReverse);
		rv.reverseMethod(subStringOdd, subStringOddReverse);
		
		System.out.println();
		System.out.println("Even SubString Reversed: ");
		System.out.println(subStringEvenReverse);
		
		System.out.println();
		System.out.println("Odd SubString Reversed: ");
		System.out.println(subStringOddReverse);
	}
}

class reverse 
{
	public reverse () {
		
	}
	
	char[] reverseMethod (char[] inputChar, char [] reversed) {
		for (int i = 0, j = inputChar.length - 1; i < inputChar.length; i++, j--) 
		{
			reversed[j] = inputChar[i];
		}
		return reversed;
	}
}
