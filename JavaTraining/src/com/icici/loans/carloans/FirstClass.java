package com.icici.loans.carloans;

public class FirstClass {
	public static void main(String[] args) {
		String st1 = "This World is Very Nice";
		  String st2 = " And Beautiful.";
		  System.out.println("st1 equalts to st2..?"+st1.equals(st2));
		  System.out.println("Concatenation of st1 and st2 Is ->"+st1.concat(st2));
		  System.out.println("Character at Index 9 Is ->"+st1.charAt(9));
		  
		  int j = 75;
		  String val2 = String.valueOf(j);
		  System.out.println("Value Of string val2 Is -> "+val2);
		  
		  String val1="50";
		  int i = Integer.parseInt(val1);
		  System.out.println("Value Of int i Is -> "+i);
		  
		  System.out.println("Retrieving sub string from string -> "+st1.substring(5, 13));
		  
		  String splt[] = st1.split("Very");
		  System.out.println("String Part 1 Is -> "+splt[0]);
		  System.out.println("String Part 2 Is -> "+splt[1]);
		  
		  System.out.println("Trimmed st2 -> "+st2.trim()); 
		  
		  if (i<j) 
			  System.out.println("Value Of i("+i+") Is Smaller Than Value Of j("+j+")." );
		  
		  int number=109;
	        if(number > 0)
	        {
	            System.out.println(number+" is a positive number");
	        }
	        else if(number < 0)
	        {
	            System.out.println(number+" is a negative number");
	        }
	        else
	        {
	            System.out.println(number+" is neither positive nor negative");
	        }
	}

}
