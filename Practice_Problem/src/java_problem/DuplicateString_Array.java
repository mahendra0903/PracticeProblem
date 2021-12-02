package java_problem;

public class DuplicateString_Array {
	
	public static void main(String[] args) {
		
		String names[]= {"java","c","python","c++","java","phzaz","c#"};
		
		for(int i=0;i<=names.length-1;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("duplicate element is:"+names[i]);
				}
			}
		}
	}

}
