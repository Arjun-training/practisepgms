package solidprinciples;

public class Car implements Vehicle {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car is moving");
		
		
	}
	/* public void default1() {
		System.out.println("Car class default method");
	}*/
	 
	 public static void staticex() {
			System.out.println("Car class static method");
		}
	 public static void main(String[] args) {
		Vehicle.staticex();
		Vehicle v=new Car();
		v.default1();
		
	}
}
