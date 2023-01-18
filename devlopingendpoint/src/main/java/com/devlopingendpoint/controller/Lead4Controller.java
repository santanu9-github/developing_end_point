package com.devlopingendpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlopingendpoint.entity.Lead4;
import com.devlopingendpoint.service.Lead4Service;


@RestController
@RequestMapping("/leads4")
public class Lead4Controller {
@Autowired
private Lead4Service lead4service;
@GetMapping
public List<Lead4> getAllLead4() {
List<Lead4> lead4 = lead4service.allLead4();
return lead4;
}
@PostMapping
public void saveLead4(@RequestBody Lead4 lead4) {
	lead4service.saveOneLead4(lead4);
}
@PutMapping
public void updatelead4(@RequestBody Lead4 lead4) {
	lead4service.saveOneLead4(lead4);
}
@DeleteMapping("/delete/{id}")
public void deleteLead4(@PathVariable("id")long id) {
	lead4service.deleteLead4(id);
}
@RequestMapping("/api/get/{id}")
public Lead4 getOneLead4(@PathVariable("id")long id) {
	
	Lead4 lead4 = lead4service.findLeadById(id);
	return lead4;	
}
}
