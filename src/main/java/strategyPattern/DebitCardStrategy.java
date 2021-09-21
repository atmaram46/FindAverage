package strategyPattern;

public class DebitCardStrategy implements PaymentStrategy {

	
	private String name;
	private String cardNumber;
	private String cvv;
	
	public DebitCardStrategy(String name, String cardNumber, String cvv) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	@Override
	public void pay(float amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "paid via debit card by : " + this.name);
		System.out.println("cardd Number : " + this.cardNumber);
	}

}
