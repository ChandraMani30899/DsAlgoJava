package com.chandra.recurssion;

public class ReturnKeyPadd {

	public static String[] keyPad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuz", "wxyz" };

	
	public static String[] keypad(int n){
		
		if(n==0) {
			String[] ans= {""};
			return ans;
		}
		
		String smallAns[] = keypad(n/10);
         int k=n%10;
         
         String s=keyPad[k];
         char[] c=s.toCharArray();
         String ans[]=new String[c.length*smallAns.length];
         
         int x=0;
         
         for(int i=0;i<c.length;i++) {
        	 for(int j=0;j<smallAns.length;j++) {
        		 ans[x]=smallAns[j]+c[i];
        		 x++;
        	 }
         }
		 return ans;
	}
	
	public static void main(String[] args) {

		String ans[]=keypad(234);
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+", ");
		}
		
		System.out.print(ans.length);
	}

}
