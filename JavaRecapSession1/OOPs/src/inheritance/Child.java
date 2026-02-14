package inheritance;

public class Child extends Parent{
	
	
	public Child() {
		super();  // Parent();
		System.out.println("Child() is called object created..");
		
	}
	
	
	public void m2() {
		
		System.out.println("m2() is called from Child");
		
	}
	
	
	@Override
	public String toString() {
	
		return "Child class toString called";
	}
	

	public static void main(String[] args) {

			int x = 10;
		
			Parent p = new Parent();
			
			p.m1();
			System.out.println(p);  // p.toString()
			
			
			Child c = new Child();
			
			c.m2();
			c.m1();
			System.out.println(c.toString());
			
			Parent p1  = new Child(); // Runtime Polymorphism
		
				Child c1 =  (Child)  p1; // explicit type casting
				
				
			//Child c2 = (Child) new Parent();  //  invalid
			
	}

}
