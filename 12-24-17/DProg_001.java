import java.util.Scanner;  // needed for Scanner

public class DProg_001 
{
	private static Scanner scanner = new Scanner( System.in );

	//check if string can be parsed to int
	public static boolean isNumeric(String input) {
		  try {
		    Integer.parseInt(input);
		    return true;
		  }
		  catch (NumberFormatException e) {
		    // s is not numeric
		    return false;
		  }
	}

	//check if input can be split to verify proper formatting
	public static boolean validInput(String input) {
		  try {
		    String splitinput[]= input.split(":");
		    String stringhour = splitinput[0];
			String stringminute = splitinput[1]; 
		    return true;
		  }
		  catch (Exception e) {
		    // s is not numeric
		    return false;
		  }
	}

    public static void main(String[] args) {

		System.out.print( "Enter a time of hh:mm format... " + '\n');

		// Read a line of text from the user.
		String input = scanner.nextLine();
		boolean userInputCheck = validInput(input);

		//the input is of valid format
		if( userInputCheck == true)
		{
			//split the input into hour and minute parts
			String splitinput[]= input.split(":");
			String stringhour = splitinput[0];
			String stringminute = splitinput[1]; 
			//initialize variables
			int hour = 0;
			int minutes = 0;
			boolean timevalidation = true;
			boolean secondNumCheck = false;
			String timeadj = "";
			String minuteWord = "";

			//test if the hour time is actually a number
			boolean intTest = isNumeric(stringhour);
			if (intTest == true)
			{
				hour = Integer.parseInt(stringhour); 
			}
	        else
	        {
	        	//invalid
	        }
	        //test if the minutes time is actually a number
	        boolean intTest2 = isNumeric(stringminute);
			if (intTest2 == true)
			{
				minutes = Integer.parseInt(stringminute); 
			}
	        else
	        {
	        	//invalid
	        }
	        //if both minutes and hours are real numbers
	        if (intTest == true & intTest2 == true)
	        {
		        String hourString;
		        String amORpm; 
		        switch (hour) 
		        {
		        	case 0:	 hourString = "Twelve";
		            		 amORpm = "am";
		                     break;

		            case 1:  hourString = "One";
		            		 amORpm = "am";
		                     break;
		            case 2:  hourString = "Two";
		            		amORpm = "am";
		                     break;
		            case 3:  hourString = "Three";
		            		amORpm = "am";
		                     break;
		            case 4:  hourString = "Four";
		            		amORpm = "am";
		                     break;
		            case 5:  hourString = "Five";
		            		amORpm = "am";
		                     break;
		            case 6:  hourString = "Six";
		            		amORpm = "am";
		                     break;
		            case 7:  hourString = "Seven";
		            		amORpm = "am";
		                     break;
		            case 8:  hourString = "Eight";
		           		 amORpm = "am";
		                     break;
		            case 9:  hourString = "Nine";
		            		amORpm = "am";
		                     break;
		            case 10: hourString = "Ten";
		            		amORpm = "am";
		                     break;
		            case 11: hourString = "Eleven";
		            		amORpm = "am";
		                     break;
		            case 12: hourString = "Twelve";
		            		amORpm = "pm";
		                     break;
		            case 13: hourString = "One";
		            		amORpm = "pm";
		                     break;
		            case 14: hourString = "Two";
		            		amORpm = "pm";
		                     break;
		            case 15: hourString = "Three";
		            		amORpm = "pm";
		                     break;
		            case 16: hourString = "Four";
		            		amORpm = "pm";
		                     break;         
		            case 17: hourString = "Five";
		            		amORpm = "pm";
		                     break;
		            case 18: hourString = "Six";
		            		amORpm = "pm";
		                     break;
		            case 19: hourString = "Seven";
		            		amORpm = "pm";
		                     break;
		            case 20: hourString = "Eight";
		            		amORpm = "pm";
		                     break;
		            case 21: hourString = "Nine";
		            		amORpm = "pm";
		                     break;
		            case 22: hourString = "Ten";
		            		amORpm = "pm";
		                     break;
		            case 23: hourString = "Eleven";
		            		amORpm = "pm";
		                     break;
		            default: hourString = "Invalid hour";
		            		amORpm = "";
		                     break;
		        }

		        //Split the minutes string in half (2 numbers) to optimise time to text choice
		        String s = stringminute; //put our string minutes into new var
			    final int mid = s.length() / 2;	//length of string in half
			    String[] parts = {
			        s.substring(0, mid),
			        s.substring(mid),
			    }; //each half is stored. Length is variable but useless for current formatting
	
			//minutes first numver
				if (parts[0].equals("0"))
				{
					timeadj = "oh";
				}
				else if (parts[0].equals("1")) 
				{
					//teen and preteen time
					secondNumCheck = true;
					
					if (parts[1].equals("0"))
					{
						minuteWord = "Ten";
					}
					if (parts[1].equals("1"))
					{
						minuteWord = "Eleven";
					}
					if (parts[1].equals("2"))
					{
						minuteWord = "Twelve";
					}
					if (parts[1].equals("3"))
					{
						minuteWord = "Thirteen";
					}
					if (parts[1].equals("4"))
					{
						minuteWord = "Fourteen";
					}
					if (parts[1].equals("5"))
					{
						minuteWord = "Fifthteen";
					}
					if (parts[1].equals("6"))
					{
						minuteWord = "Sixteen";
					}
					if (parts[1].equals("7"))
					{
						minuteWord = "Seventeen";
					}
					if (parts[1].equals("8"))
					{
						minuteWord = "Eigtheen";
					}
					if (parts[1].equals("9"))
					{
						minuteWord = "Nineteen";
					}
				}
				else if (parts[0].equals("2")) 
				{
					timeadj = "twenty";
				}
				else if (parts[0].equals("3")) 
				{
					timeadj = "thirty";
				}
				else if (parts[0].equals("4")) 
				{
					timeadj = "forty";
				}
				else if (parts[0].equals("5")) 
				{
					timeadj = "fifty";
				}
				else //number larger than 5 is not a real time therefore invalid
				{ timevalidation = false; }
			//Minutes second number
				if (secondNumCheck == false) //number is not a "preteen / teen" number
				{
					//convert second number to proper text
					if (parts[1].equals("0"))
					{
						minuteWord = " clock";
					}
					else if (parts[1].equals("1"))
					{
						minuteWord = " one";
					}
					else if (parts[1].equals("2"))
					{
						minuteWord = " two";
					}
					else if (parts[1].equals("3"))
					{
						minuteWord = " three";
					}
					else if (parts[1].equals("4"))
					{
						minuteWord = " four";
					}
					else if (parts[1].equals("5"))
					{
						minuteWord = " five";
					}
					else if (parts[1].equals("6"))
					{
						minuteWord = " six";
					}
					else if (parts[1].equals("7"))
					{
						minuteWord = " seven";
					}
					else if (parts[1].equals("8"))
					{
						minuteWord = " eight";
					}
					else if (parts[1].equals("9"))
					{
						minuteWord = " nine";
					}
					else //impossible case 
					{ timevalidation = false; }
				}

				//valid input verify for output print
				if (timevalidation == true)
				{
		         System.out.println("The time is " + hourString + " " +timeadj + minuteWord + " " + amORpm);
				}
				else	// validation failed...
				{
					System.out.println("Invalid Input... input time invalid");	
				}

		    }
		    else
		    {
		    	//if the time could not be parsed to int, it is invalid
		    	System.out.println("Invalid Input... input not real numbers");	
		    }
	    }
	    else
	    {
	    	//failed valid format
		    System.out.println("Invalid Input... formatting incorrect");	
		}	
	}

}
