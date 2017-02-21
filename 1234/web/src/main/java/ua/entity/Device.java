package ua.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_device")
	private int id;
	
	@Column (name = "name_device")
	private String nameDevice;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type")
	DeviceType deviceType;
	
	

	public Device() {
		super();
	}

	public Device(String nameDevice) {
		super();
		this.nameDevice = nameDevice;
	}

	public Device(String nameDevice, DeviceType deviceType) {
		super();
		this.nameDevice = nameDevice;
		this.deviceType = deviceType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameDevice() {
		return nameDevice;
	}

	public void setNameDevice(String nameDevice) {
		this.nameDevice = nameDevice;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	
	
	@Override
	public String toString() {
		return "Device [id=" + id + ", nameDevice=" + nameDevice + ", deviceType=" + deviceType + "]";
	}

	
	
	
}
