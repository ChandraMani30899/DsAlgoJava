package com.chandra.recurssion;

public class SumOfNumbers {
	
	public static int SumofNnaturalNumbers(int n) {
		if(n==1)
			return 1;
		
		
		int smallAns= SumofNnaturalNumbers(n-1);
		return n+smallAns;
	}
	
	public static void main(String args[]) {
		int n=10;
		System.out.println(SumofNnaturalNumbers(n));
	}

}

