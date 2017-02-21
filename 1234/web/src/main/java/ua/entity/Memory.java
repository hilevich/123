package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Memory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int value;
	
	private String description;
	
	@OneToMany(mappedBy = "memory")
	private List<Charecteristic> listMemory = new ArrayList<Charecteristic>();

	public Memory() {
		super();
	}

	public Memory(int value, String description) {
		super();
		this.value = value;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Charecteristic> getListMemory() {
		return listMemory;
	}

	public void setListMemory(List<Charecteristic> listMemory) {
		this.listMemory = listMemory;
	}

	@Override
	public String toString() {
		return "Memory [id=" + id + ", value=" + value + ", description=" + description + ", listMemory=" + listMemory
				+ "]";
	}
	
	
	
}
