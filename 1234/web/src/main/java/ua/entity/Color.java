package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Color {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	private String color;

	@OneToMany(mappedBy = "color")
	List<Charecteristic> listColor = new ArrayList<Charecteristic>();

	public Color() {
		super();
	}

	public Color(String color) {
		super();
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Charecteristic> getListColor() {
		return listColor;
	}

	public void setListColor(List<Charecteristic> listColor) {
		this.listColor = listColor;
	}

	@Override
	public String toString() {
		return "Color [id=" + id + ", color=" + color + ", listColor=" + listColor + "]";
	}
	
	
		
	
}
