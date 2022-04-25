package TestLambda;

public class Test2 implements Runnable
{
	
	@Override
	public void run() 
	{
		System.out.println("Running Thread");	
	}
	public static void main(String[] args) 
	{
		Test2 t1 = new Test2();
		
	}
}


