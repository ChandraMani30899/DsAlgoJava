package com.chandra.recurssion;

import java.util.*;

public class CivilWar{
     public static Scanner scan=new Scanner(System.in);
   public static void main(String args[]){
         int n=scan.nextInt();
         
        int[] a=new int[n];
     
       for(int i=0;i<n;i++){
         
         int temp=scan.nextInt();
         a[i]=temp;
       }
     
       int i=0;
       int j=n-1;
     
      int sum1=0;
      int sum2=0;
      
      while(i<j) {
    	  int sum=0;
    	  int atlest1=0;
    	  int start1;
    	  int start2;
    	   if(a[i]<a[j]) {
    		   start1=j;
    		   start2=i;
    	   }
    	   else {
    		   start1=i;
    		   start2=j;
    	   }
    	    while(sum+a[start1]>sum ||atlest1!=0) {
    	    	sum=sum+a[start1];
    	    	atlest1++;
    	    	start1++;
    	    }
    	    
    	    sum1+=sum;
    	  int sum0=0;
    	  int atlest2=0;
    	  
    	  while(sum0+a[start2]>sum0 ||atlest2!=0) {
  	    	sum0=sum0+a[start2];
  	    	atlest2++;
  	    	j++;
  	    }

    	  
    	     
    	  
      }
   
   }
     
 

}