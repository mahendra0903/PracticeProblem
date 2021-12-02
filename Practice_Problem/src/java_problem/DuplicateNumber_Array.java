package java_problem;

public class DuplicateNumber_Array {
	
	public static void main(String[] args) {
		
		int num[]= {10,34,65,87,97,98,43,65,34,10};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)//
			{
				if(num[i]==num[j])//10==34
				{
					System.out.println("duplicate number is:"+num[i]);
				}
			}
		}
	}

}
