package example1;

public class PaymentProcessor {
	
	public void processPayment(Payment pm) {
		pm.acceptPayment();
	}
	public static void main(String[] args) {
		PaymentProcessor pp= new PaymentProcessor();
		Payment pm= new CreditCardPayment();
		pp.processPayment(pm);
		
	}

}
