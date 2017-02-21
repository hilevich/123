package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Repair;
import ua.repository.RepairRepository;
import ua.service.RepairService;

@Service
public class RepairServiceImpl implements RepairService{

	@Autowired
	RepairRepository repairRepository;
	
	@Override
	public List<Repair> findAll() {
		
		return repairRepository.findAll();
	}

	@Override
	public Repair findOne(int id) {
		
		return repairRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		
		repairRepository.delete(id);
	}

	@Override
	public void save(Repair repair) {
	
		
		
		repairRepository.save(repair);
	}

	@Override
	public Repair edit(int id) {
		
		Repair repair = findOne(id);
		
		return repair;
	}

	
	
	
	
	
	
	
	
	
}
