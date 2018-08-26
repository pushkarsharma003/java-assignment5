import java.util.Scanner;
class Complex
{
	public void display(int r,int i)
	{
		System.out.println(r+"+"+"i"+i);
	}
	public static void main(String[] args)
	{
		int real,imag;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the real part");
		real=s.nextInt();
		System.out.println("enter the imag part");
		imag=s.nextInt();
		Complex obj=new Complex();
		obj.display(real,imag);
	}
}