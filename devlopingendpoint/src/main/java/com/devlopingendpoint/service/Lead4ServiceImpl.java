package com.devlopingendpoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlopingendpoint.entity.Lead4;
import com.devlopingendpoint.repositoty.Lead4Repository;
@Service
public class Lead4ServiceImpl implements Lead4Service {
@Autowired
private Lead4Repository leadRepo;
	@Override
	public List<Lead4> allLead4() {
		List<Lead4> lead4 = leadRepo.findAll();
		return lead4;
	}
	@Override
	public void saveOneLead4(Lead4 lead4) {
		leadRepo.save(lead4);
	}
	@Override
	public void deleteLead4(long id) {
		leadRepo.deleteById(id);
	}
	@Override
	public Lead4 findLeadById(long id) {
		Optional<Lead4> findById = leadRepo.findById(id);
		if(findById.isPresent()) {
			Lead4 lead4 = findById.get();
			return lead4;
		}else {
			return null;
		}
	}

}
