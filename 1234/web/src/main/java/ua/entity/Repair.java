package ua.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Repair {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_repair")
	private int id;
	
	
	private String description;
	
	private String price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Device device;

	public int getId() {
		return id;
	}

	
	
	public Repair() {
		super();
	}



	public Repair(String description, String price, Device device) {
		super();
		this.description = description;
		this.price = price;
		this.device = device;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}



	@Override
	public String toString() {
		return "Repair [id=" + id + ", description=" + description + ", price=" + price + ", device=" + device + "]";
	}
	
	
}
