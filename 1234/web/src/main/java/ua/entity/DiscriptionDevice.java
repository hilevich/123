package ua.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class DiscriptionDevice {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	private String description;
	
	private String urlPicture;
	
	private String urlVideo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_description")
	DeviceShop deviceShop;

	public DiscriptionDevice() {
		super();
	}

	public DiscriptionDevice(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public DiscriptionDevice(String title, String description, String urlPicture) {
		super();
		this.title = title;
		this.description = description;
		this.urlPicture = urlPicture;
	}
	
	

	public DiscriptionDevice(String title, String description, String urlPicture, String urlVideo,
			DeviceShop deviceShop) {
		super();
		this.title = title;
		this.description = description;
		this.urlPicture = urlPicture;
		this.urlVideo = urlVideo;
		this.deviceShop = deviceShop;
	}

	public DiscriptionDevice(String title, String description, String urlPicture, DeviceShop deviceShop) {
		super();
		this.title = title;
		this.description = description;
		this.urlPicture = urlPicture;
		this.deviceShop = deviceShop;
	}

	public DiscriptionDevice(String title, String description, DeviceShop deviceShop) {
		super();
		this.title = title;
		this.description = description;
		this.deviceShop = deviceShop;
	}

	public DiscriptionDevice(int id, String title, String description, String urlPicture, String urlVideo) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.urlPicture = urlPicture;
		this.urlVideo = urlVideo;
	}

	public DiscriptionDevice(String title, String description, String urlPicture, String urlVideo) {
		super();
		this.title = title;
		this.description = description;
		this.urlPicture = urlPicture;
		this.urlVideo = urlVideo;
		
	}
	
	

	public DeviceShop getDeviceShop() {
		return deviceShop;
	}

	public void setDeviceShop(DeviceShop deviceShop) {
		this.deviceShop = deviceShop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlPicture() {
		return urlPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	
	@Override
	public String toString() {
		return "DiscriptionDevice [id=" + id + ", title=" + title + ", description=" + description + ", urlPicture="
				+ urlPicture + ", urlVideo=" + urlVideo + "]";
	}
	
	
}
