package jitterzcafe;

public class Product {
	private String name;
	private String category;
	private String description;
	private double price;
<<<<<<< HEAD
=======
	

	public Product(String name, String category, String description, double price) {
		super();
		setName(name);
		setCategory(category);
		setDescription(description);
		setPrice(price);
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
>>>>>>> e6a2ea8d266021305ea3158f1204794e9125be4d

	public Product(String name, String category, String description, double price) {
		super();
		setName(name);
		setPrice(price);
		setCategory(category);
		setDescription(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
