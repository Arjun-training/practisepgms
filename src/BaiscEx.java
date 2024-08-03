
public class BaiscEx implements A{
//
//	@Override
//	public void move() {
//		// TODO Auto-generated method stub
//		System.out.println("its moving");
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
	
		BaiscEx e=new BaiscEx();
	/*(e)->{
		e.run();
	}*/
		
		A a=new A() {
			public void run() {
				System.out.println("run");
			}
		};
		a.run();
		
		/*A a1=new A() {
			
		};*/
		a.sit();
	}

}
