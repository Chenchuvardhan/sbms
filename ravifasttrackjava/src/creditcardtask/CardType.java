package creditcardtask;

public class CardType {
	public CreditCardPoints calculateTypeCard(Customer customer, int creditPoints) {
		if (creditPoints < 100)
			return new CreditCardPoints(customer, "EMI");
		else if (creditPoints > 101 && creditPoints < 501)
			return new CreditCardPoints(customer, "Silver");
		else if (creditPoints > 501 && creditPoints < 1001)
			return new CreditCardPoints(customer, "Gold");
		else
			return new CreditCardPoints(customer, "Platinum");
	}
}
