package java_problem;

public class Largest_3Num {
	
	public static void main(String[] args) {
		int a=12;
		int b=3;
		int c=5;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+"is largest number");
			}
			else
			{
				System.out.println(c+"is largest number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+"is largest number");
			}
			else
			{
				System.out.println(c+"is largest number");
			}
		}
	}

}
