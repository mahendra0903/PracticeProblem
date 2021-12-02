package java_problem;

public class Fibonacci_Series {
	
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int a=0;a<10;a++)
		{
			n3=n1+n2;//1+1=2
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
