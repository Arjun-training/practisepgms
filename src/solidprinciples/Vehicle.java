package solidprinciples;

public interface Vehicle {
	
	void move();
	
	//void abc();

	default void default1() {
		System.out.println("default method");
	}
	
	static void staticex() {
		System.out.println("static method ");
	}
}
