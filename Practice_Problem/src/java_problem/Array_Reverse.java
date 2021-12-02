package java_problem;

public class Array_Reverse {
	
	public static void main(String[] args) {
		
		int a []= {20,40,60,80,100};
		System.out.println("Original Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array in Reverse Order:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
