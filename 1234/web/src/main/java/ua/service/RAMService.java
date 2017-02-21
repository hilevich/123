package ua.service;

import java.util.List;

import ua.entity.RAM;

public interface RAMService {

	List<RAM> findAll();
	
	void save(RAM ram);
	
	void delete(int id);
}
