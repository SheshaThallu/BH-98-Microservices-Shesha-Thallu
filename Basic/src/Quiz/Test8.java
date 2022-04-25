package Quiz;

public class Test8
{
	public String convert(int value) {
		return value.toString();
	}
	public String convert(Integer value) {
		return value.toString();
    }
	public String convert(Object value) {
		return value.toString();
	}
		
	public static void main(String... args) {
		
		Test8 obj = new Test8();
		System.out.println(obj.convert(10));
	}
}
