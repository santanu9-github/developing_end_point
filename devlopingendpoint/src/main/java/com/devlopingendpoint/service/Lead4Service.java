package com.devlopingendpoint.service;

import java.util.List;

import com.devlopingendpoint.entity.Lead4;

public interface Lead4Service {
public List<Lead4>allLead4();

public void saveOneLead4(Lead4 lead4);

public void deleteLead4(long id);

public Lead4 findLeadById(long id);
}
