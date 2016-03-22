package algos;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ab";
		
		System.out.println(compress(input));
		System.out.println(compresstushar(input));
	}
	
	public static String compress(String input){
		
		StringBuilder result = new StringBuilder();
		int count =1;
		if(input.length() == 1){
			return result.append(input+""+count).toString();
		}
		for(int i = 0 ; i< input.length()-1;i++){
		    
			if(input.charAt(i) == input.charAt(i+1)){
				count ++;
			}
			else{
				result.append(input.charAt(i) +""+ count);
				count =1;
			}
		}
		
		if(input.charAt(input.length()-1) != input.charAt(input.length()-2)){
			result.append(input.charAt(input.length()-1)+""+1);
		}
		else{
			result.append(input.charAt(input.length()-1)+""+count);
		}
		return result.toString();
		
	}
	
	public static String compresstushar(String S){
		
		int start=0;
		int end = 0;
		
		int count =0;
		StringBuilder result = new StringBuilder();
		while(end < S.length()){
			if(S.charAt(start) == S.charAt(end)){
				count ++;	
				System.out.println(S.charAt(start)+ " "+ count);
			}
			else if(S.charAt(start) != S.charAt(end)){
				result.append(S.charAt(start)+""+count);
				start = end;
				count=1;
			}
			end++;
		}
		
		//Append the final part
		result.append(S.charAt(start)+""+count);
		return result.toString();
	}
	
}
