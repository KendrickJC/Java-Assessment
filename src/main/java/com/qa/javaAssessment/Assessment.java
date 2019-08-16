package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			for(int j=1;j<=3;j++) {
				word += input.substring(i,i+1);
			}
			
			//word += input.substring(i, i+1);
			//word += input.substring(i, i+1);
			//word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		
		boolean output;
		//int BtoA, BtoC;
		
		int AtoB,AtoC,BtoC;
		
		AtoB = Math.abs(b-a);
		BtoC = Math.abs(b-c);
		AtoC = Math.abs(c-a);
		
		if((AtoB == BtoC) || (BtoC == AtoC)||(AtoC == AtoB)) {
			output = true;
		}else {
			output = false;
		}
		return output;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		
		for(int i=0;i<input.length();i++) {
			
		}
		
		return "";
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		int block=0;
		int newBlock = 0;
		
		//int count = 1;
		for (int i = 0; i< input.length()-1; i++) {
			
			if(input.substring(0,1)=="") {
				return 0;
			}
			else if(newBlock==block) {
				if(input.charAt(i)==input.charAt(i+1)) {
					block+=1;
				}
			}else {
				if(input.charAt(i)==input.charAt(i+1)) {
					newBlock+=1;
					
				}
			}
			
			//System.out.println(input.charAt(i));
			//System.out.println(block);
			//System.out.println("New block: "+newBlock);
			 
		}
		if(newBlock>block) {
			block=newBlock-block;
			//newBlock = 0;
		}
		
		
		
		return block;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		
		String a[] = arg1.split(" "); 
		  
		int count = 0; 
		for (int i = 0; i < a.length; i++)  
		{  
			if ("am".equals(a[i])|| ("Am".equals(a[i]))){
				count++; 
			} 

		} 
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		String output = null;
		if((arg1%3==0)&&(arg1%5==0)){
			output = "fizzbuzz";
		}else if(arg1%3==0) {
			output = "fizz";
		}else if (arg1%5==0) {
			output = "buzz";
		}
		return output;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		int total = 0;
		int newTotal = total;
		for(int i=0;i<arg1.length()-1;i++) {
			if(arg1.substring(i,i+1) != " ") {
				//while(arg1.substring(i,i+1)!= " ") {
				//if(i==arg1.length() -1) {
					//return newTotal;
				//}
				total = arg1.charAt(i) + arg1.charAt(i+1);
				if(total>newTotal) {
					newTotal=total;
				}
				//}

			}
		}
		
		return newTotal;
	}
}
