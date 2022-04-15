package com.chandra.recurssion;

public class PrintKeyPadd {

	public static String[] keyPad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuz", "wxyz" };

     
	public static void printKeypadHelper(int input,String output){
	
	  if(input==0) {
		  System.out.println(output);
		  return;
	  }
	  
	  int k=input%10;
	  char[] arr=keyPad[k].toCharArray();
	  
	  for(int i=0;i<arr.length;i++) {
		  printKeypadHelper(input/10,arr[i]+output);
	  }
		
	}

	
	
	public static void printKeypad(int input){
	
		   printKeypadHelper(input,"");
		
	}

	public static void main(String[] args) {
		printKeypad(234);
	}
}
