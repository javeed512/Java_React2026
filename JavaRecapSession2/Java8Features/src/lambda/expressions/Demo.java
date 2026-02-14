package lambda.expressions;

public class Demo {

	public static void main(String[] args) {


		
		MyInterface mi =	(int a, int b) -> { return a+b;};
		
		//MyInterface mi =  (a,b) -> a+b;
		
		//MyInterface mi = (x,y) -> x+y;
		
			System.out.println("Result "+mi.add(5, 4));
			
			
			MyInterface.m1();  // static method
		
			
			mi.m2(); // default method
			
	}

}
