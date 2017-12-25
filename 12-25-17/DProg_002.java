//Encodes a string of text (with no spaces) to a password based on Affine Cipher 

import java.util.Scanner;  // needed for Scanner

public class DProg_002
{
	private static Scanner scanner = new Scanner( System.in ); 
    public static void main(String[] args) 
    {
    	System.out.println("Enter text input to cipher: ");

    	char[] input = scanner.next().toCharArray(); 
    	String inputString = new String(input);
    	String[] inputArray = inputString.split("");//("(?!^)");
    	String[] stringArray= {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};  
    	int inputNum =0, a = 3 , b =2, C =1, i, j;

    	System.out.println("The original input is: " + inputString );
    	System.out.print("The converted input is: ");	
    	
    	for (j=0; j<inputString.length()+1; j++)
    	{
			for (i=0; i<27; i++)
			{
	    		if (inputArray[j].equals(stringArray[i]) )
	    		{
	    			C = ((a * i ) % 26 )+ b ; 
	    			System.out.print(stringArray[C]);
	    		}
	    	}
    	}System.out.print("\n");
    }
}
