class Staticblock
{
	static int i;
	static 
	{
		i=10;
		System.out.println("hi from static block");
	}
}
class StaticExample
{
	public static void main(String[] args)
	{
		System.out.println("value of i is "+Staticblock.i);
	}
}