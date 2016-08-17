package jitterzcafe;

public class Product {
	private String name;
	private String category;
	private String description;
	private double price;
	private String menuItem;

	public Product(String name, String category, String description,String item, double price)  {
		super();
		setName(name);
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
