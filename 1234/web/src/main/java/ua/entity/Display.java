package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Display {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double size;
	
	private String description;
	
	@OneToMany(mappedBy = "display")
	private List<Charecteristic> listCharecteristic = new ArrayList<Charecteristic>();

	public Display() {
		super();
	}

	public Display(double size, String description) {
		super();
		this.size = size;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public List<Charecteristic> getListCharecteristic() {
		return listCharecteristic;
	}

	public void setListCharecteristic(List<Charecteristic> listCharecteristic) {
		this.listCharecteristic = listCharecteristic;
	}

	
	@Override
	public String toString() {
		return "Display [id=" + id + ", size=" + size + ", description=" + description + ", listCharecteristic="
				+ listCharecteristic + "]";
	}

	
}
