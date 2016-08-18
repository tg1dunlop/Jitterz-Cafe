package jitterzcafe;

public class Product {
	private String name;
	private String category;
	private String description;
	private double price;
	private String menuItem;

	public Product(String name, String category, String description,String item, double price)  { //used in our main to set up ArrayList ProdList
		super();		//use product constructor to set information on each product in the product class, 
		setName(name); //use getters and setters to pull back the information on the product 
		setCategory(category);
		setDescription(description);
		setPrice(price);
		setMenuItem(item);
	}
	

	public String getMenuItem() {
		return menuItem;
	}


	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
