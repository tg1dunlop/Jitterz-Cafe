package jitterzcafe;

public class payment extends Product {
	
	private double quantity;
	private double salesTax;
	private String paymentType;
	private String checkNum;
	
	//public payment(String name, String category, String description, double price) {
		//super(name, category, description, price);
//}
	
	private payment(String name, String category, String description, double price, double quantity, double salesTax,
			String paymentType, String checkNum) {
		super(name, category, description, price);
		setQuantity(quantity);
		setSalesTax(salesTax);
		setPaymentType(paymentType);
		setCheckNum(checkNum);
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	//put in extra methods for the math 
	public double getSubTotal(){
		double subtotal = 0;
		return subtotal;
	}
	public double getGrandTotal() {
	double grandTotal = 0;
	return grandTotal; 
	}
//from getters/setters
	public String getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(String checkNum) {
		this.checkNum = checkNum;
	}
	
	
}