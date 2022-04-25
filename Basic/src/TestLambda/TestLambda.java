package TestLambda;

public class TestLambda 
{
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Running Thread");
		Thread t1 = new Thread(r);
		Runnable r1 = () -> System.out.println("Running Thread 1");
		Thread t2 = new Thread(r1);
		Runnable r2 = () -> System.out.println("Running Thread 2");
		Thread t3 = new Thread(r2);
		t1.start();
		t2.start();
		t3.start();
	}
}
