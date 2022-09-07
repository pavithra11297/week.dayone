package weekone.daytwo;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="we learn java basics in java session";
		int count=0;
		String[] text=str.split(" ");
		for(int i=0;i<text.length;i++)
		{
			for (int j=0;j<text.length;j++)
			{
				if(text[i].equals(text[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				str=str.replace(text[i], "");
			}
			count=0;
		}
		System.out.println("Without Duplication word:- " +str);

	}
}

