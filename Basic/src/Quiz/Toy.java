package Quiz;

public class Toy {
	  public void play() {
	  	System.out.print("play-");
	  }
	  public void finalizer() {
	  	System.out.print("clean-");
	  }
	  public static void main(String[] fun) {
	  	Toy car = new Toy();
	  	car.play();
	  	System.gc();
	  	Toy doll = new Toy();
	  	doll.play();
	  	System.out.println();
	  	String john = "john";
	  	String jon = new String(john);
	  	System.out.println((john==jon) + " "+ (john.equals(jon)));
	  	int meal = 5;
	  	int tip = 2;
	  	int total = meal + (meal>6 ? ++tip : --tip);
	  	System.out.println(tip);
	  }
	}
