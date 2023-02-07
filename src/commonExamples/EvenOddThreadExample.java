package commonExamples;

import java.awt.List;
import java.util.ArrayList;

public class EvenOddThreadExample {

	int n=10;
	ArrayList<Integer> l= new ArrayList<Integer>();
	ArrayList<Integer> l1= new ArrayList<Integer>();
	public synchronized void printOdd() {
		// TODO Auto-generated method stub
		//int n=10;
		
		for(int i=0;i<n;i++) {
		if(i%2==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			l.add(i);
		}
		notify();
		}
	}

	public synchronized void printEven() {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			if(i%2==1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println(i);
				l1.add(i);
			}
			notify();
		}
		System.out.println(l);
		System.out.println(l1);
	}
	

}
