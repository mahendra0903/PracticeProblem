package java_problem;

public class String_Char_Count {
	
	public static void main(String[] args) {
		
		String a="mahendra appa kolate";
		int count =0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println("Total Numbers of Charcters in a String:"+count);
	}

}
