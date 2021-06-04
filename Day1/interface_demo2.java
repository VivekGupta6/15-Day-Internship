interface A
{
	public void show();
}
interface B
{
	public void display();
}
class C implements A,B
{
	public void show()
	{
		System.out.println("This is interface");
	}
	public void display()
	{
		System.out.println("This is multiple inheritance of interface");
	}
}
class interface_demo2
{
	public static void main(String args[])
	{
		C c=new C();
		c.show();
		c.display();
	}
}