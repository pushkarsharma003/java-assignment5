import java.util.Scanner;
class Waveform
{
	public static void main(String[] args)
	{
		int[] array=new int[10];
		Scanner s=new Scanner(System.in);
		for (int i=0;i<10;i++)
		{
			array[i]=s.nextInt();
		}
		for (int i=0;i<10;i++)
		{
			System.out.print(array[i]+" ");
		}
		for (int i=0;i<10;i=i+2)
		{
			int j=i+1;
			int temp;
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		System.out.println();
		for (int i=0;i<10;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
} 