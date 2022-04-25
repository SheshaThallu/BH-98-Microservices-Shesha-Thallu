package TestLambda;

public class Test implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Running Thread");	
	}
	public static void main(String[] args) 
	{
		Test test = new Test();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		Thread t3 = new Thread(test);
		t1.start();
		t2.start();
		t3.start();
	}
}
