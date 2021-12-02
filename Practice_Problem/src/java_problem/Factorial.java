package java_problem;

public class Factorial {
	
	
	public static void main(String[] args) {
		
		int fact=1,num=5;
		for(int a=1;a<=num;a++)
		{
			fact=fact*a;
		}
		System.out.println("Factorial of" + num +"is:" +fact);
	}
	
	
}
