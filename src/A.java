import java.util.function.Consumer;

@FunctionalInterface
public interface A {
	
//	public void move();
	
	/*
	//public boolean predicate
	Consumer<String> c=(s)->{
		System.out.println(s);
	};*/
	
	public abstract void run();
	
	default void sit() {
		System.out.println("Siiting");
	}
	

}
