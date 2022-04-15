package com.chandra.recurssion;

public class printSubsequence {

	
	public static void printSubsequencesHelper(String input,String output) {

		        if(input.length()==0)
		        	{
		        	  System.out.println(output);
		        	  return;
		        	}
		     char c = input.charAt(0);
		     input = input.substring(1);
		     
		     printSubsequencesHelper(input,output);
		     printSubsequencesHelper(input,output+c);
		     
	}

	
	public static void printSubsequences(String input) {
	     printSubsequencesHelper(input,"");

	}

	public static void main(String[] args) {
		printSubsequences("Bani");
	}

}
