package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class RAM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String discription;

	private int value;
	
	@OneToMany(mappedBy = "ram")
	private List<Charecteristic> listRAM = new ArrayList<Charecteristic>();

	public RAM() {
		super();
	}
	
	

	public RAM(String discription, int value, List<Charecteristic> listRAM) {
		super();
		this.discription = discription;
		this.value = value;
		this.listRAM = listRAM;
	}

	
	
	public RAM(String discription, int value) {
		super();
		this.discription = discription;
		this.value = value;
	}

	


	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public List<Charecteristic> getListRAM() {
		return listRAM;
	}

	public void setListRAM(List<Charecteristic> listRAM) {
		this.listRAM = listRAM;
	}



	@Override
	public String toString() {
		return "RAM [id=" + id + ", discription=" + discription + ", value=" + value + ", listRAM=" + listRAM + "]";
	}

	

	
	
	
	
}
