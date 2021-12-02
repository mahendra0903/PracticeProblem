package java_problem;

public class Array_Prime {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,5,8,9};
		int prime = a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]==0 || a[i]==1 )
			{
				System.out.println("number is not prime");
			}
		}
	}

}
