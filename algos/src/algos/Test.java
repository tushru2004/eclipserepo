package algos;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int [] arr = new int[2];
	    arr[0] = 4;
	    arr[1] = 5;
	    changeContent(arr);

	    System.out.println(arr[0]);  // Will print 10.. 

	}

	public static void changeContent(int[] arr) {

	   // If we change the content of arr.
	   arr[0] = 10;  // Will change the content of array in main()
	  
	}
}
