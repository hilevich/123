package ua.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DeviceType {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_type")
	private int id;
	
	private String typeDivice;
	
	@OneToMany(mappedBy = "deviceType")
	private List<Device> listDevece = new ArrayList<>();

	
	
	public DeviceType() {
		super();
	}

	public DeviceType(String typeDivice) {
		super();
		this.typeDivice = typeDivice;
	}

	public DeviceType(String typeDivice, List<Device> listDevece) {
		super();
		this.typeDivice = typeDivice;
		this.listDevece = listDevece;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeDivice() {
		return typeDivice;
	}

	public void setTypeDivice(String typeDivice) {
		this.typeDivice = typeDivice;
	}

	public List<Device> getListDevece() {
		return listDevece;
	}

	public void setListDevece(List<Device> listDevece) {
		this.listDevece = listDevece;
	}

	@Override
	public String toString() {
		return "DeviceType [id=" + id + ", typeDivice=" + typeDivice + ", listDevece=" + listDevece + "]";
	}

	
	
	
}
