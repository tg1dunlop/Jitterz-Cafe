package jitterzcafe;

import java.math.BigDecimal;

public class payment extends Product {

	private  double quanity;
	private  double saleTax;
	private  String paymentType;
	
	
	/**
	 * @param name
	 * @param category
	 * @param description
	 * @param price
	 * @param quanity
	 * @param saleTax
	 * @param paymentType
	 */
	
	public payment(String name, String category, String description, double price, double quanity, double saleTax,
			String paymentType) {
		super(name, category, description, price);
		setQuanity(quanity);
		setSaleTax(.06);
		setPaymentType(paymentType);
	}

	public double getQuanity() {
		return quanity;
	}

	public void setQuanity(double quanity) {
		this.quanity = quanity;
	}

	public double getSaleTax() {
		return saleTax;
	}

	public void setSaleTax(double saleTax) {
		this.saleTax = saleTax;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getSubtotal(Product[] orders){
		double subtotal = 0;
		for (int i = 0; i < orders.length; i++) {
			subtotal += orders[i].getPrice();
			System.out.println(orders[i].getPrice());
		}
		return subtotal;
	}
	public double getGrandTotal(Product[] orders){
		double grandTotal =0;
		double tax = getSaleTax();
		double subtot = getSubtotal(orders);
		grandTotal = tax + subtot;
		return grandTotal;
		
	}

}



