package strategyPattern;

public class PaytmStrategy implements PaymentStrategy {
	
	String name;
	String paytmAccountNumber;
	
	public  PaytmStrategy(String name, String account) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.paytmAccountNumber = account;
	}

	@Override
	public void pay(float amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid with paytm by " + this.name);
	}

}
