package java_problem;

public class Largest_4Num {
	
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a +"is largest number");
				}
				else
				{
					System.out.println(d+"is largest number");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c+"is largest number");
				}
				else
				{
					System.out.println(d+"is largest number");
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println(b+"is largest number");
				}
				else
				{
					System.out.println(d+"is largest number");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c+"is largest number");
				}
				else
					
				{
					System.out.println(d+"is largest number");
				}
			}
		}
		
	}

}
