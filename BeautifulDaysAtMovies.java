mport java.util.Scanner;


public class BeautifulDaysAtMovie {

	static int reverse(int data)
	{
		int rev=0,d;
		while(data>0){
			d=data%10;
			rev=rev*10+d;
			data=data/10;
		}
		return rev;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		int count=0;
		for(int a=i;a<=j;a++)
		{
			int revA=reverse(a);
			if((a-revA)%k==0)
				count++;
		}
		System.out.println(count);
	}
}

