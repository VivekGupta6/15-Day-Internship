class A
{
	int x=0;
	void check_exception()throws ArithmeticException
	{
		if(x==0)
		{
		 throw new ArithmeticException("Maths Error");
		}
		else
		{
		 System.out.println(2/x);
		}
	}
}
class exception_demo
{
	public static void main(String args[])
	{
		A a=new A();
		try{
		a.check_exception();
		}
		catch(Exception e)
		{
			System.out.println(e+" is error");
		}
		finally
		{
			System.out.println("Hello this is finally");
		}
	}
}