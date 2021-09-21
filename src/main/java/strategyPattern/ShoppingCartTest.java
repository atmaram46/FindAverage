package strategyPattern;

public class ShoppingCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingCart shoppingcart = new ShoppingCart();
		
		Item item1 = new Item("soap", 20, "qwer50t");
		Item item2 = new Item("deo", 300, "pymnqwe1");
		
		shoppingcart.addItem(item1);
		shoppingcart.addItem(item2);
		
		shoppingcart.pay(new CreditCardStrategy("vijay", "1234567890", "cvv"));
		
		shoppingcart.pay(new PaytmStrategy("abc", "pay65788493TM"));
		
		shoppingcart.pay(new DebitCardStrategy("omg", "kyafarkpadtahai", "hmm"));

	}

}
