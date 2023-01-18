package com.devlopingendpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devlopingendpoint.dto.Lead4Data;
import com.devlopingendpoint.entity.Lead4;
import com.devlopingendpoint.service.Lead4Service;

@Controller
public class Lead4Controller2 {
	
@RequestMapping("/createlead4")
public String createLead4() {
	return"create_new_lead4";
}
@Autowired
private Lead4Service leadService;

@RequestMapping("/savelead")
public String saveLead(@ModelAttribute("lead4")Lead4 lead4,ModelMap model) {
	leadService.saveOneLead4(lead4);
	model.addAttribute("save","save record");
	return"create_new_lead4";
}
@RequestMapping("/listlead4")
public String getLead4(ModelMap model){
	List<Lead4> lead4 = leadService.allLead4();
	model.addAttribute("lead4",lead4);
	return"search_lead4";
}
@RequestMapping("/delete")
public String deleteLead4(@RequestParam("id")long id,ModelMap model) {
	leadService.deleteLead4(id);
	List<Lead4> lead4 = leadService.allLead4();
	model.addAttribute("lead4",lead4);
	return"search_lead4";
}
@RequestMapping("/update")
public String updateLead4(@RequestParam("id")long id,ModelMap model) {
	Lead4 lead4 = leadService.findLeadById(id);
	if(lead4!=null) {
		model.addAttribute("lead4",lead4);
		return"update_lead4";
	}else {
		model.addAttribute("error","record not match");
		return"error_page4";
	}
}
@RequestMapping("/updatelead")	
public String updateLead4(Lead4Data data,ModelMap model) {
		Lead4 l=new Lead4();
		l.setId(data.getId());
		l.setFirstName(data.getFirstName());
		l.setLastName(data.getLastName());
		l.setEmail(data.getEmail());
		l.setMobile(data.getMobile());
		leadService.saveOneLead4(l);
		
		List<Lead4> lead4 = leadService.allLead4();
		model.addAttribute("lead4",lead4);
		return"search_lead4";
	}
}
