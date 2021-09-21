package strategyPattern;

public class CreditCardStrategy implements PaymentStrategy {
	
	private String name;
	private String cardNumber;
	private String cvv;
	
	
	public  CreditCardStrategy(String name, String cardNumber, String cvv) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	@Override
	public void pay(float amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " payed with credit card ");
		System.out.println("Card Numer : " +this.cardNumber);
	}

}
