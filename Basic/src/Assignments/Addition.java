package Assignments;


public class Addition{
	
	static int add(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		Addition2 addition=new Addition2();
		Addition2 addition2=new Addition2();
		addition.setA(10);
		addition.setB(20);
		addition2.setA(20);
		addition2.setB(30);
		addition.setC(add(addition.getA(),addition.getB()));
		System.out.println(addition.getC());
	}
}