package ua.service;

import java.util.List;

import ua.entity.Device;

public interface DeviceService {

	List<Device> findAll();
	
	Device findOne(int id);
	
	void save(Device device);
	
	void edit(int id);
	
	void delete(int id);
	
}
