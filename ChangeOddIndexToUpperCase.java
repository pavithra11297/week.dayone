package weekone.daytwo;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "changeme";
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if (i % 2 == 0)
			{
				char s1 = ch[i];
				System.out.print(s1);
			}
			else
			{
				String s2 =String.valueOf(ch[i]);
				s2=s2.toUpperCase();
				System.out.print(s2);

			}

		}
	}

}
