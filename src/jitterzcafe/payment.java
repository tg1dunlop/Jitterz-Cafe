package jitterzcafe;

import java.util.ArrayList;

public class payment{

	private  double quanity;
	private  double saleTax;
	private  String paymentType;
	

	

	/**
	 * @param quanity
	 * @param saleTax
	 * @param paymentType
	 */
	public payment(double quanity, double saleTax, String paymentType) {
		super();
		setQuanity(quanity);
		setSaleTax(saleTax);
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
	
	public double getSubtotal(int qty,double price){
		double subtotal = 0;
		subtotal = qty * price;
		return subtotal;
	}
	public double getGrandTotal(int qty,double stotal){
		double grandTotal =0;
		double tax = .06;
		grandTotal = (tax * stotal)+stotal;
		return grandTotal;
		
	}
	/*public String[] setOrderReceipt(int cnt,String desc, double price){
		String[] receipt = new String [12];
		for (int i = 0; i < receipt.length; i++) {
			receipt[i]= desc + price; 
		}
		return receipt;
		*/
	
	//public void getOrderReceipts(){
		//for (int j = 0; j < receipt.size(); j++) {
		//System.out.println(receipt.get(j));
	//}
	
	//return receipt;
	
	
	}
	
	





