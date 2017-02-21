package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class AdditionalCharecteristic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String discription;
	
	@ManyToMany
	@JoinTable (name = "charecteristic_additionalCharacteristic", joinColumns = @JoinColumn(name = "id_additionalCharacteristic"), inverseJoinColumns = @JoinColumn(name = "id_Charecteristic"))
	private List<Charecteristic> listAdditionalCharecteristic = new ArrayList<Charecteristic>();

	public AdditionalCharecteristic(String name, String discription,
			List<Charecteristic> listAdditionalCharecteristic) {
		super();
		this.name = name;
		this.discription = discription;
		this.listAdditionalCharecteristic = listAdditionalCharecteristic;
	}

	public AdditionalCharecteristic(String name, String discription) {
		super();
		this.name = name;
		this.discription = discription;
	}

	public AdditionalCharecteristic() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public List<Charecteristic> getListAdditionalCharecteristic() {
		return listAdditionalCharecteristic;
	}

	public void setListAdditionalCharecteristic(List<Charecteristic> listAdditionalCharecteristic) {
		this.listAdditionalCharecteristic = listAdditionalCharecteristic;
	}

	@Override
	public String toString() {
		return "AdditionalCharecteristic [id=" + id + ", name=" + name + ", discription=" + discription
				+ ", listAdditionalCharecteristic=" + listAdditionalCharecteristic + "]";
	}
	
	
}
