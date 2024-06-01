package Inventory.Data.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Inventory")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id ;
	
	@Column
	private String Items;
	
	@Column
	private String Specification;
	
	@Column 
	private String Price;
	
	
	
	

	public Product() {
		
	}
	
	public Product(long id, String Items, String Specification, String Price) {
		this.id=id;
		this.Items=Items;
		this.Specification=Specification;
		this.Price=Price;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItems() {
		return Items;
	}

	public void setItems(String items) {
		Items = items;
	}

	public String getSpecification() {
		return Specification;
	}

	public void setSpecification(String specification) {
		Specification = specification;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	
}
