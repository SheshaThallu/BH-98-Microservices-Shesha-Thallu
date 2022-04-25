package Quiz;

public class Test4{  
    
	static int start = 2;
	final int end;
	public Test4(int x) {
		x = 4;
		end = x;
	}
	public void fly(int distance) {
		System.out.println(end-start+" ");
		System.out.println(distance);
	}
    public static void main(String []args){  
    	new Test4(10).fly(5);
    }  
}  
