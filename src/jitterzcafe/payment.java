package jitterzcafe;

public class payment extends Product{


	
	private double quantity;
	private double salesTax;
	private String paymentType; 

	
	
	public payment(String name, String category, String description, double price, double quantity, double salesTax,
			String paymentType) {
		super(name, category, description, price);
		setQuantity(quantity);
		setSalesTax(salesTax);
		setPaymentType(paymentType);
	}


	//public payment(String name, String category, String description, double price) {
		//super(name, category, description, price);
	//}
	

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


	public double getSubTotal(){
		double subtotal = 0;
		return subtotal;
	}
	public double getGrandTotal(){
		double grandtotal = 0;
		return grandtotal;
	}


	

}
