package entities;

public class Product implements Comparable<Product>{

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name=name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + String.format("%.2f", this.getPrice());
	}
	@Override
	public int compareTo(Product other) {
		
		return this.price.compareTo(other.getPrice());
	}
	
}
