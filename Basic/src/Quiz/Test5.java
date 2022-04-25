package Quiz;

public class Test5 
{
    public static void main(String a[]) {
    	try {
    		int val = 10/0;
    	} catch(Exception e) {
    		System.out.println(e);
    	} catch(ArithmeticException ae) {
    		System.out.println(ae);
    	}
    }
} 
