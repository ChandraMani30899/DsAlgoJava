package com.chandra.recurssion;

public class FindAllSubsequences {

	public static String[] findAllSubsequences(String str) {
		if(str.length()==0) {
			String[] ans= {""};
			return ans;
		}
		
		char c = str.charAt(0);
		String smallAns[]=findAllSubsequences(str.substring(1));
		int k=0;
		String ans[]=new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=smallAns[i];
			k++;
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=c+smallAns[i];
			k++;
		}
		
		return ans;
	}
    
	
	public static void main(String[] args) {
		
		String str="Bani";
		
		String ans[]=findAllSubsequences(str);
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+", ");
		}
	}
}
