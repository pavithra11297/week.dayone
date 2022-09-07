package weekone.daytwo;

public class Palindrome {

	public static void main(String[] args) {
		String str="Madam";
		String str2="";
		char[] strchar=str.toCharArray();
		for(int i=strchar.length-1;i>=0;i--)
		{
			str2=str2+String.valueOf(strchar[i]);
		}
		if(str.toLowerCase().equals(str2.toLowerCase()))
		{
			System.out.println(str+ " is the Palindrome");
		}
		else
		{
			System.out.println(str2+ " is the not Palindrome");

		}    
	}

}


