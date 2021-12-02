package java_problem;

public class Array_LargestNum {
	
	public static void main(String[] args) {
		int[] a = {10,20,5,8,9};
		int max = a[0];
		
		for(int i=1; i<a.length-1; i++)
		{
			if(a[i]>max)
			{
				max= a[i];
		    }
		}
		System.out.println("Maximum number of array is:"+max);
	}

}
