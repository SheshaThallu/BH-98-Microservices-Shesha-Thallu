package Assignments;

public class OddOrEven 
{
	private int number;
	OddOrEven(int number)
	{
		this.number = number;
	}
	public static void main(String[] args) 
	{
		OddOrEven obj = new OddOrEven(10);
		System.out.println(check(obj.getNumber()));
	}

	private static String check(int n) 
	{
		if(n%2==0)
			return "Even";
		else
			return "Odd";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
