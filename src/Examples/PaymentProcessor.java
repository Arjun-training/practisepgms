package Examples;

public class PaymentProcessor {
	
	public void processPayment(Payment pm /*PaymentMode pm*/) {
		/*if(pm==pm.CASH) {
			CashPayment cp= new CashPayment();
			cp.accpetPayment();
		}else if(pm==pm.CREDIT_CARD) {
			CreditCardPayment ccp= new CreditCardPayment();
			ccp.accpetPayment();
		}*/
		pm.accpetPayment();
	}
	public static void main(String[] args) {
		PaymentProcessor pp= new PaymentProcessor();
		//pp.processPayment(PaymentMode.CASH);
		//pp.processPayment(PaymentMode.CREDIT_CARD);
		Payment p1=new CashPayment();
		pp.processPayment(p1);
		
		
	}

}
