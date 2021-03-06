package by.bsu.lab2.entity;
import java.util.List;

public class Order {

	private long id;
	
	private Person client;
	private List<Merchandise> existingProducts;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Person getClient() {
		return client;
	}
	public void setClient(Person client) {
		this.client = client;
	}
	public List<Merchandise> getExistingProducts() {
		return existingProducts;
	}
	public void setExistingProducts(List<Merchandise> existingProducts) {
		this.existingProducts = existingProducts;
	}

}