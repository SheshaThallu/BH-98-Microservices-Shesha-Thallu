package Assignments;

public class PrimeOrNot 
{
	private int number;
	PrimeOrNot(int number)
	{
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	static String checkPrime(int n)
	{
		int i=2;
		while(true)
		{
			if((n%i==0 || n==1) && n!=2)
			{
				return "Not Prime";
			}
			i++;
			if(i>Math.sqrt(n))
			{
				return "Prime";
			}
		}
	}
	public static void main(String[] args) 
	{
		PrimeOrNot obj = new PrimeOrNot(7);
		System.out.println(checkPrime(obj.getNumber()));
	}
}
