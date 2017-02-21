package ua.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.entity.Device;
import ua.entity.Repair;
import ua.service.DeviceService;
import ua.service.RepairService;



@Controller
public class IndexController {
	
	@Autowired
	RepairService repairService;
	
	@Autowired
	DeviceService deviceService;
	
	
	
	@RequestMapping("/")
	public String index(Model model){
	
		
		model.addAttribute("lists", repairService.findAll());
		return "user-index";
	}
	
	@RequestMapping("/pay")
	public String pay(Model model){
		
		return "user-pay";
	}
	
	@RequestMapping("/garanted")
	public String garanted(Model model){
		
		return "user-garanted";
	}
	
	@RequestMapping("/service")
	public String service(Model model){
		
		return "user-service";
	}
	
	@RequestMapping("/serviceIphone7Plus")
	public String serviceIphone7Plus(Model model){
		model.addAttribute("phone", "Iphone 7 Plus");
		
		ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(12);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
			
		
		return "user-serviceIphone";
	}	
	
	@RequestMapping("/serviceIphone7")
	public String serviceIphone7(Model model){
		model.addAttribute("phone", "Iphone 7");
		
		ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(11);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
	
	@RequestMapping("/serviceIphone6sPlus")
	public String serviceIphone6sPlus(Model model){
		model.addAttribute("phone", "Iphone 6S Plus");
		
ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(10);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
	
	@RequestMapping("/serviceIphone6s")
	public String serviceIphone6s(Model model){
		model.addAttribute("phone", "Iphone 6S");
		
		ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(9);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
	
	@RequestMapping("/serviceIphone6Plus")
	public String serviceIphone6Plus(Model model){
		model.addAttribute("phone", "Iphone 6 Plus");
		
		ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(8);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
	
	@RequestMapping("/serviceIphone6")
	public String serviceIphone6(Model model){
		model.addAttribute("phone", "Iphone 6");
		
ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(7);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
   
	@RequestMapping("/serviceIphone5s")
	public String serviceIphone5s(Model model){
		model.addAttribute("phone", "Iphone 5S");
		
		ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(6);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
	
	@RequestMapping("/serviceIphone5")
	public String serviceIphone5(Model model){
		model.addAttribute("phone", "Iphone 5");
		
ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(5);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
  

	@RequestMapping("/serviceIphone5c")
	public String serviceIphone5c(Model model){
		model.addAttribute("phone", "Iphone 5c");
		
		ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(4);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
    
	@RequestMapping("/serviceIphone4S")
	public String serviceIphone4S(Model model){
		model.addAttribute("phone", "Iphone 4S");
		
ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(3);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}
	
	@RequestMapping("/serviceIphone4")
	public String serviceIphone4(Model model){
		model.addAttribute("phone", "Iphone 4");
		
		ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(2);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}
	
	@RequestMapping("/serviceIphone3")
	public String serviceIphone3(Model model){
		model.addAttribute("phone", "Iphone 3");
		
ArrayList<Repair> list = new ArrayList<Repair>();
		
		Device device = deviceService.findOne(1);
		
		for (Repair repair : repairService.findAll()) {
			if(repair.getDevice().getId()==device.getId()){
				list.add(repair);
			}
			
		}
	
		model.addAttribute("lists", list); 
		
		return "user-serviceIphone";
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}