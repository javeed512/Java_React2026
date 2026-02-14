package lambda.expressions;


public interface MyInterface {  // Functional Interface
	
	
	public abstract int add(int a, int b); // Function functional interface

	
	public static void m1() {
		
		
		System.out.println("this is m1() from interface");
	}
	
	public default void m2() {
		
		
		System.out.println("this is m2() from interface");
		
	}
	

}
