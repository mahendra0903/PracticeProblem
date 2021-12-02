package java_problem;

public class Armstrong_4digit {
	
	public static void main(String[] args) {
	  
		int a,b,c,d,e,f,g;
		for(a=1000;a<=9999;a++)
		{
		
			b=a%100;
			c=b%10;
			d=b/10;
			e=a/100;
			f=e%10;
			g=e/10;
			
			if((c*c*c*c+d*d*d*d+f*f*f*f+g*g*g*g)==a)
			{
				System.out.println(a);
			}
		
		}
		
	}
	
}
