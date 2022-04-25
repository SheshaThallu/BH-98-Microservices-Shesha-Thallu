package Assignments;

public class Calculator 
{
	private double firstNumber;
	private double secondNumber;
	Calculator(double firstNumber, double secondNumber) 
	{
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	double addition()
	{
		return firstNumber + secondNumber;
	}
	double subtraction()
	{
		return firstNumber - secondNumber;
	}
	double multiplication()
	{
		return firstNumber * secondNumber;
	}
	double division()
	{
		return firstNumber / secondNumber;
	}
	public static void main(String[] args) 
	{
		Calculator c = new Calculator(10.6, 5.4);
		System.out.println(c.getFirstNumber() + " + " + c.getSecondNumber() + " = " + c.addition());
		System.out.println(c.getFirstNumber() + " - " + c.getSecondNumber() + " = " + c.subtraction());
		System.out.println(c.getFirstNumber() + " * " + c.getSecondNumber() + " = " + c.multiplication());
		System.out.println(c.getFirstNumber() + " / " + c.getSecondNumber() + " = " + c.division());
	}
}
