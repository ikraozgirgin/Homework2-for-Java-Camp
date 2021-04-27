package odev2Sonu;

public class Product {

	private int id =005;
	private String name;
	private String description;
	private int price;
	String kod;
	


public Product(int id, String name, String description, int price) {
	this.id =id;
	this.name = name;
	this.description =description;
	this.price = price;
	
}
	
	String getKod() {
		return this.name.substring(0, 1)+ id;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	
	
	
	 
	
	
	
}
