package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Device;
import ua.repository.DeviceRepository;
import ua.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService{

	@Autowired
	DeviceRepository deviceRepository;   
	
	@Override
	public List<Device> findAll() {
		
		return deviceRepository.findAll();
	}

	@Override
	public Device findOne(int id) {
		
		return deviceRepository.findOne(id);
	}

	@Override
	public void save(Device device) {
		
		deviceRepository.save(device);
	}

	@Override
	public void edit(int id) {
		Device device = findOne(id);
		
		save(device);
	}

	@Override
	public void delete(int id) {
		deviceRepository.delete(id);
		
	}

}
