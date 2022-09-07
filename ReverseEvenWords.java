package weekone.daytwo;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str="I am a software tester";
		String[] text=str.split(" ");
		for(int i=0;i<text.length;i++)
		{
			if(i%2!=0)
			{
				char[] rev1=text[i].toCharArray();
				for(int j=rev1.length-1;j>=0;j--)
				{
					System.out.print(rev1[j]);
				}
			}
			else
			{
				System.out.print(" " +text[i]+ " ");
			}
		}
	}

}


