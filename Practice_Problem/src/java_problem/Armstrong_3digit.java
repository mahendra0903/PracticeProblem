package java_problem;

public class Armstrong_3digit {
	
	public static void main(String[] args) {
		int a,b,c,d,e;
		for(a=100;a<=999;a++) 
		{
		    b=a%10;
		    c=a/10;
		    d=c%10;
		    e=a/100;
		    	if((b*b*b+d*d*d+e*e*e)==a)
		    	{
		    		System.out.println(a);
		    	}
		}

	}
}
