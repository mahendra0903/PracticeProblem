package java_problem;

public class Prime_Number {
	
	public static void main(String[] args) {
		int flag=0;
		int num=10;		
		
		if(num==0||num==1)
		{
			System.out.println(num+"is not prime number");
		}
		else
		{
			for(int i=1;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+"is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+"is prime number");
			}
		}
	}

}
