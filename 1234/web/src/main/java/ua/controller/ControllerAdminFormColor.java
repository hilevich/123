package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.entity.Color;
import ua.service.ColorService;

@Controller
@RequestMapping("/admin/formColor")
@SessionAttributes(names="formColor")
public class ControllerAdminFormColor {
	
	@Autowired
	private ColorService colorService;
	
	@ModelAttribute("formColor")
	public Color getFormColor(){
		return new Color();
	}
	
	
	
	
	
	
	
	
	
}
