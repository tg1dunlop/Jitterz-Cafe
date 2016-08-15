package jitterzcafe;

<<<<<<< HEAD
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
=======
public class payment extends Product{

<<<<<<< HEAD

	
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


	
||||||| merged common ancestors
public class payment extends Product {
=======
public class payment {
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
		//super(name, category, description, price);
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
>>>>>>> e6a2ea8d266021305ea3158f1204794e9125be4d
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
<<<<<<< HEAD
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
=======
	public double getSubtotal(){
		double subtotal = 0;
		return subtotal;
	}
	public double getGrandTotal(){
		double grandTotal =0;
		return grandTotal;
		
	}
>>>>>>> d46d02054f2e34785518f6c8ffddbdaa31fdfc78
>>>>>>> e6a2ea8d266021305ea3158f1204794e9125be4d

	public void setCheckNum(String checkNum) {
		this.checkNum = checkNum;
	}
	
	
}
