package inheritance;

public class Parent extends Object {
	
	public Parent() {
		super(); // Object();
			System.out.println("Parent() called.. object created..");
		
	}
	
	
	public void m1() {
		
		
			System.out.println("m1() from Parent.");
		
	}
	
	@Override
	public String toString() { // Runtime Polymorphism
		
		return "Parent class toString()";
		
	}
	

}
