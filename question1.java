import java.util.Scanner;
class Rectangle
{
	public void CalculateArea(int l,int b)
	{
		int res;
		res=l*b;
		System.out.println("area of rectangle is :"+res);
	}
	public static void main(String[] args)
	{
		int length,breathe,result;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the length");
	length=s.nextInt();
	System.out.println("enter the breathe");
	breathe=s.nextInt();
	Rectangle obj=new Rectangle();
	obj.CalculateArea(length,breathe);
	}
}