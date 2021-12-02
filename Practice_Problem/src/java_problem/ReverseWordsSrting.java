package java_problem;

public class ReverseWordsSrting {
	
	public static void main(String[] args) {
		
		String s = "mahendra appa kolate";
		
		String words[] = s.split("\\s");
		String reversedString="";
		
		//Reverse each word's position
		for(int i=0;i<words.length;i++)
		{
			if(i==words.length-1)
			{
				reversedString = words[i]+reversedString;
			}
			else
			{
				reversedString = " " +words[i]+reversedString;
		}
		}
		System.out.println("Revered String:"+ reversedString);
	}

}
