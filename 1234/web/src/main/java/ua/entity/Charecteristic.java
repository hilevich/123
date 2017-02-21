package ua.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Charecteristic {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_color")
	private Color color;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ram")
	private RAM ram;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_memory")
	private Memory memory;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_display")
	private Display display;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "id_processor")
	private Processor processor;
	
	@ManyToMany
	@JoinTable (name = "charecteristic_additionalCharacteristic", joinColumns = @JoinColumn(name = "id_Charecteristic"), inverseJoinColumns = @JoinColumn(name = "id_additionalCharacteristic"))
	private List<AdditionalCharecteristic> listCharecteristic = new ArrayList<AdditionalCharecteristic>();

	public Charecteristic(Color color, RAM ram, Memory memory, Display display, Processor processor) {
		super();
		this.color = color;
		this.ram = ram;
		this.memory = memory;
		this.display = display;
		this.processor = processor;
	}

	public Charecteristic(Color color, RAM ram, Memory memory, Display display, Processor processor,
			List<AdditionalCharecteristic> listCharecteristic) {
		super();
		this.color = color;
		this.ram = ram;
		this.memory = memory;
		this.display = display;
		this.processor = processor;
		this.listCharecteristic = listCharecteristic;
	}
	
	

	public Charecteristic() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public List<AdditionalCharecteristic> getListCharecteristic() {
		return listCharecteristic;
	}

	public void setListCharecteristic(List<AdditionalCharecteristic> listCharecteristic) {
		this.listCharecteristic = listCharecteristic;
	}

	@Override
	public String toString() {
		return "Charecteristic [id=" + id + ", color=" + color + ", ram=" + ram + ", memory=" + memory + ", display="
				+ display + ", processor=" + processor + ", listCharecteristic=" + listCharecteristic + "]";
	}
	
	
}


