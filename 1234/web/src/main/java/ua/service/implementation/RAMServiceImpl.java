package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.RAM;
import ua.repository.RAMRepository;
import ua.service.RAMService;

@Service
public class RAMServiceImpl implements RAMService {

	@Autowired
	RAMRepository rAMRepository;
	
	@Override
	public List<RAM> findAll() {
		
		return rAMRepository.findAll();
	}

	@Override
	public void save(RAM ram) {

		rAMRepository.save(ram);
		
	}

	@Override
	public void delete(int id) {
		
		rAMRepository.delete(id);
		
	}

}
