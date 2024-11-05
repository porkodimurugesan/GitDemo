package firstClass;

public class MyRegex {
	
	public static void main(String args[])
	{
		
		String str="000.293.2010";
		String[] tempStr=str.split(".");
		for(String s:tempStr)
		{
			System.out.println(s);
		}
		
	}

}
