package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.service.ColorService;
import ua.service.RAMService;
import ua.service.RepairService;

@Controller
public class AdminController {

	@Autowired
	ColorService colorService;
	
	@Autowired
	RepairService repairService;
	
	@Autowired
	RAMService rAMService;
	
	
	
	@RequestMapping("/admin")
	public String admin(Model model){
	
		model.addAttribute("colors",colorService.findAll());
		model.addAttribute("lists", repairService.findAll());
		model.addAttribute("rams", rAMService.findAll());
		return "admin-admin";
	}
	
	@RequestMapping("/admin/edit")
	public String adminEdit(Model model){
	
		
		model.addAttribute("lists", repairService.findAll());
		return "admin-admin_edit";
	}
	
	@RequestMapping("/admin/phone")
	public String adminPhone(Model model){
	
		
		model.addAttribute("lists", repairService.findAll());
		return "admin-admin_phone";
	}
	
	@RequestMapping("/admin/phone/edit")
	public String adminPhoneEdit(Model model){
	
		
		model.addAttribute("lists", repairService.findAll());
		return "admin-admin_phone_edit";
	}
	@RequestMapping("/admin/repair")
	public String adminRepair(Model model){
	
		
		model.addAttribute("lists", repairService.findAll());
		return "admin-admin_repair";
	}
	
}
