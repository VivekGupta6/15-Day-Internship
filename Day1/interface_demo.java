interface A
{
	public void show();
}
class B implements A
{
	public void show()
	{
		System.out.println("This is interface");
	}
}
class interface_demo
{
	public static void main(String args[])
	{
		B b=new B();
		b.show();
	}
}