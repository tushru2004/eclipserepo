package algos;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] Quick(int [] input,int start,int end) {
		// TODO Auto-generated method stub
       if(input.length==0 || input.length==1) return input;
       if(start>end) return input;
       
       int pos= Partition (input, start, end);
       
       Quick(input,0,pos-1);
       
       Quick(input,pos+1, input.length-1);
       
       return input;
	}
	
	public int Partition(int [] A, int start, int end)
	{
		int pos= A[end];
		for(int i = start; i<end;i++)
		{
			System.out.println();
		}
		return 1;
	}
}
