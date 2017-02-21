package ua.service;

import java.util.List;

import ua.entity.Repair;

public interface RepairService {

	List<Repair> findAll(); 
	
	Repair findOne(int id);
	
	void delete(int id);
	
	void save(Repair repair);
	
	Repair edit(int id);
}
