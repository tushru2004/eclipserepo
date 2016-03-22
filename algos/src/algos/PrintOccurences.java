package algos;

import java.io.InputStreamReader;

public class PrintOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "aabbcddd";
		int i =0;
		int count=0;
		for(int j=1;j< inp.length() ; j++){
			if(inp.charAt(i) == inp.charAt(j)){
				j++;
				count++;
			}
			else{
				System.out.println(inp.charAt(i) + count);
				
			}
		}
	}

}
