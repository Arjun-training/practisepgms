package commonExamples;

public class EvenOddThread {
	
	public static void main(String[] args) {
		EvenOddThreadExample et= new EvenOddThreadExample();
		Thread t1=new Thread(new Runnable(){
				public void run() {
					et.printOdd();
				}
		});
		Thread t2=new Thread(new Runnable() {
				public void run() {
					et.printEven();
				}
				});
		t1.start();
		t2.start();
		
	}

}
