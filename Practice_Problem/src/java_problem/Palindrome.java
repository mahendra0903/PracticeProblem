package java_problem;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int rev,sum=0;
		int n=121; 
		rev=n;
		while(n>0)
		{
			sum=(sum*10)+n%10;
			n=n/10;
			
		}
		if(rev==sum)//237==732
		{
			System.out.println(rev+"number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
