package algos;

public class maxproductsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int prod= 1;
		int maxprod = arr[0];
		int prev =1;
	  
	   System.out.println(new maxproductsubarray().maxprod(arr));
	}
	
	// Replace sum by newsum .....
	public int maxprod(int [] A)
	{ 
		int [] sum = new int[A.length];
		sum[0] = A[0];
		int max = A[0];
		
		for(int i=1;i<A.length ;i++){
			sum[i]=Math.max(sum[i-1]+A[i],A[i]);
			max = Math.max(max, sum[i]);
		}
		
		return max;
	}
	

}
