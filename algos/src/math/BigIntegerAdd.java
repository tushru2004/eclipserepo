package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BigIntegerAdd {

	 static Integer carry = 0;
	    public static void main(String args[]){
	        String s1 = "1234";
	        String s2 = "0";
	        add(s1, s2);
	    }

	    public static void add(String a, String b){
	    	StringBuilder answer = new StringBuilder();
	    	
	    	int ai= a.length()-1;
	    	int bi= b.length()-1;
	    	int carry =0;
	    	int temp =0;
	    	while(ai >=0 && bi >=0){
	    		
	    	  char achar =a.charAt(ai);
	    	  char bchar =b.charAt(bi);
	    	  
	    	  int aint= Character.getNumericValue(achar);
	    	  int bint= Character.getNumericValue(bchar);
	    	  int sum = aint+bint;
	    	  
	    	  temp = (sum +carry) % 10; // 3+9 +1
	    	  carry = sum /10;
	    	  
	    	  answer.append(temp);
	    	  ai--;
	    	  bi--;
	    	}
	    	
	    	while(ai>=0){
	    	   int sum = Character.getNumericValue(a.charAt(ai)) + carry;
	    	   answer.append(sum);
	    	   carry = sum /10;
	    	   ai--;
	    	}
	    	
	    	while(bi>=0){
	    		int sum = Character.getNumericValue(b.charAt(bi)) + carry;
		    	answer.append(sum);
		    	carry = sum /10;
		    	bi--;
	    	}
	    	
	    	if(carry!=0){
	    		answer.append(carry);
	    	}
	    	//System.out.println(answer);
	    	String ansstr= answer.toString();
	    	String reversest=reverse(ansstr);
	    	System.out.println(reversest);
	    	
	    }
	     
	    
	    public static String reverse(String original){
	    	char[] originalchar=original.toCharArray();
	    	
	    	int i=0;
	    	int j=originalchar.length-1;
	    	
	    	while(i<j){
	    		char temp = originalchar[j];
	    		originalchar[j]= originalchar[i];
	    		originalchar[i] = temp;
	    		//System.out.println(originalchar[i] + " "+ originalchar[j]);
	    		i++;
	    		j--;
	    	}
	    	
	    	return String.valueOf(originalchar);
	    }
}
