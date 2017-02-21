package ua.service;

import java.util.List;

import ua.entity.Color;

public interface ColorService {

	List<Color> findAll();
	
	void save(Color color);
	
	void delete(int id);
}
