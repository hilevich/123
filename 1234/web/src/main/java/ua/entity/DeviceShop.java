package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class DeviceShop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Device device;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Charecteristic charecteristic;
	
	private String urlPhoto;
	
	private float price;

	@OneToMany(mappedBy = "deviceShop")
	List<DiscriptionDevice> listDiscriptionDevices = new ArrayList<DiscriptionDevice>();
	
	public DeviceShop() {
		super();
	}

	public DeviceShop(Device device, float price) {
		super();
		this.device = device;
		this.price = price;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DeviceShop [id=" + id + ", device=" + device
				+ ", urlPhoto=" + urlPhoto + ", price=" + price + "]";
	}
	
	
}
