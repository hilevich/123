package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Processor {

	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private int id;
	
	private int frequency;
	
	private String discription;
	
	@OneToMany (mappedBy = "processor")
	private List<Charecteristic> listProcessor = new ArrayList<Charecteristic>();

	public Processor() {
		super();
	}

	
	
	public String getDiscription() {
		return discription;
	}



	public void setDiscription(String discription) {
		this.discription = discription;
	}



	public Processor(int frequency, String discription, List<Charecteristic> listProcessor) {
		super();
		this.frequency = frequency;
		this.discription = discription;
		this.listProcessor = listProcessor;
	}



	public Processor(String discription, List<Charecteristic> listProcessor) {
		super();
		this.discription = discription;
		this.listProcessor = listProcessor;
	}



	public Processor(String discription) {
		super();
		this.discription = discription;
	}



	public Processor(int frequency) {
		super();
		this.frequency = frequency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public List<Charecteristic> getListProcessor() {
		return listProcessor;
	}

	public void setListProcessor(List<Charecteristic> listProcessor) {
		this.listProcessor = listProcessor;
	}



	@Override
	public String toString() {
		return "Processor [id=" + id + ", frequency=" + frequency + ", discription=" + discription + ", listProcessor="
				+ listProcessor + "]";
	}

	

	
	
}
