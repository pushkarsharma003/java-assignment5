import java.util.Scanner;
class SecondLarge
{
	public static void main(String[] args)
	{
		int large=0,seclarge=0;
		int[] array=new int[10];
		Scanner s=new Scanner(System.in);
		for (int i=0;i<10;i++)
		{
			array[i]=s.nextInt();
			if (array[i]>large)
			{
				large=array[i];
			}
		}
		for (int i=0;i<10;i++)
		{
			if (array[i]<large && array[i]>seclarge)
			{
				seclarge=array[i];
			}
		}
		System.out.println("second large is "+seclarge);
	}
}