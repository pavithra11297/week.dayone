package weekone.dayone;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstnum=0;
		int secondnum=1;
		int sum;
		System.out.println(firstnum);
		System.out.println(secondnum);
		for (int i=1;i<=11;i++)
		{
			sum=firstnum+secondnum;
			System.out.println(sum);
			firstnum=secondnum;
			secondnum=sum;

		}

	}
}







