package creditcardtask;

public class CreditCardPoints {
	private Customer customer;
    private String cardType;
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public CreditCardPoints(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return customer + " having " +getCardType();
	}
    
}
